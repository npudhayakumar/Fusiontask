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
import com.food.app.databinding.DateadapterBinding
import com.food.app.view.responsemodel.Datemodel
import com.kotlintest.app.utility.interFace.CommonInterface

class DateAdapter (
    private val datelist: ArrayList<Datemodel>,
    var commonInterface: CommonInterface
) : BaseAdapter<Any>(datelist) {
    lateinit var context: Context
    var rowindex=0
    override fun onCreateViewHolderBase(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        return adapterviewholder(
            LayoutInflater
                .from(parent.context)
                .inflate( R.layout.dateadapter, parent, false)
        )
    }

    class adapterviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var databding: DateadapterBinding? = null

        init {
            databding = DataBindingUtil.bind<ViewDataBinding>(itemView) as DateadapterBinding
        }

        fun getBinding(): DateadapterBinding {
            return databding!!
        }
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder, position: Int) {
        var binding = (holder as DateAdapter.adapterviewholder).getBinding()
        binding.day.text=datelist[position].weakday
        binding.monthdate.text=datelist[position].monthdate

        binding.date.setOnClickListener {
            rowindex=position
            notifyDataSetChanged()
//            commonInterface.commonCallback(datelist[position])
            println("clickeddd")
        }
        if(rowindex==position){
            binding.day.setTextColor(context!!.resources.getColor(R.color.White))
            binding.monthdate.setTextColor(context!!.resources.getColor(R.color.White))
           binding.date.background=(context!!.resources.getDrawable(R.drawable.cornerbackgroundselect))
        } else
        {
            binding.day.setTextColor(context!!.resources.getColor(R.color.Black))
            binding.monthdate.setTextColor(context!!.resources.getColor(R.color.Black))
            binding.date.background=(context!!.resources.getDrawable(R.drawable.cornerbackground))

        }





    }

    override fun getItemCount(): Int {
        return datelist.size
    }
}