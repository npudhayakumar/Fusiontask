package com.food.app.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.food.app.R
import com.food.app.baseClass.BaseAdapter
import com.food.app.databinding.BookingadapterBinding
import com.food.app.databinding.DateadapterBinding
import com.food.app.databinding.UpcomingadapterBinding
import com.food.app.view.responsemodel.Bookingmodel
import com.food.app.view.responsemodel.Datemodel
import com.food.app.view.responsemodel.RejectModel
import com.food.app.view.responsemodel.UpcomingModel
import com.kotlintest.app.utility.interFace.CommonInterface

class Upcomingadapter (
    private val booklist: ArrayList<UpcomingModel>,
    var commonInterface: CommonInterface
) : BaseAdapter<Any>(booklist) {
    lateinit var context: Context
    override fun onCreateViewHolderBase(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        return adapterviewholder(
            LayoutInflater
                .from(parent.context)
                .inflate( R.layout.upcomingadapter, parent, false)
        )
    }

    class adapterviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var databding: UpcomingadapterBinding? = null

        init {
            databding = DataBindingUtil.bind<ViewDataBinding>(itemView) as UpcomingadapterBinding
        }

        fun getBinding(): UpcomingadapterBinding {
            return databding!!
        }
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder, position: Int) {
        var binding = (holder as Upcomingadapter.adapterviewholder).getBinding()
        binding.time.text=booklist[position].time

     binding.book.setOnClickListener {
         val map = HashMap<String, Any>()
         map.put("name", booklist.get(position).name.toString())
         map.put("timeee", booklist.get(position).time.toString())
         map.put("phone", booklist.get(position).phone.toString())
         map.put("date", booklist.get(position).date.toString())
         map.put("people", booklist.get(position).people.toString())
         map.put("deposite", booklist.get(position).depositee.toString())
            commonInterface.commonCallback(map)
        }

    }

    override fun getItemCount(): Int {
        return booklist.size
    }
}