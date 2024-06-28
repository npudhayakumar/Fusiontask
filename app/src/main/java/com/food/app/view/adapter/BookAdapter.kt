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
import com.food.app.view.eventmodel.BookeventMOdel
import com.food.app.view.responsemodel.Bookingmodel
import com.food.app.view.responsemodel.Datemodel
import com.kotlintest.app.utility.interFace.CommonInterface
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class BookAdapter (
    private val booklist: ArrayList<Bookingmodel>,
    var commonInterface: CommonInterface

) : BaseAdapter<Any>(booklist) {
    var positionn= 0
    init {
        EventBus.getDefault().register(this)
    }

    lateinit var context: Context
    override fun onCreateViewHolderBase(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        return adapterviewholder(
            LayoutInflater
                .from(parent.context)
                .inflate( R.layout.bookingadapter, parent, false)
        )
    }

    class adapterviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var databding: BookingadapterBinding? = null

        init {
            databding = DataBindingUtil.bind<ViewDataBinding>(itemView) as BookingadapterBinding
        }

        fun getBinding(): BookingadapterBinding {
            return databding!!
        }
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder, position: Int) {
        var binding = (holder as BookAdapter.adapterviewholder).getBinding()
        binding.time.text=booklist[position].time
positionn=position
     binding.book.setOnClickListener {
         val map = HashMap<String, Any>()
         map.put("name", booklist.get(position).name.toString())
         map.put("timeee", booklist.get(position).time.toString())
         map.put("phone", booklist.get(position).phone.toString())
         map.put("date", booklist.get(position).date.toString())
         map.put("people", booklist.get(position).people.toString())
         map.put("deposite", booklist.get(position).depositee.toString())
         map.put("position", position)
            commonInterface.commonCallback(map)
        }

    }

    override fun getItemCount(): Int {
        return booklist.size
    }

    // Unregister EventBus when adapter is destroyed
    fun unregister() {
        EventBus.getDefault().unregister(this)
    }

    @Subscribe
    fun onEvent(event: BookeventMOdel) {
        println("positionnn"+event.position)
     removeItem(event.position.toInt())

    }

    fun removeItem(position: Int) {
        if (position < 0 || position >= booklist.size) return
        booklist.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }



}