package com.food.app.view.activity

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.MenuItem
import android.view.View
import android.view.Window
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.ViewDataBinding
import androidx.drawerlayout.widget.DrawerLayout
import com.food.app.R
import com.food.app.baseClass.BaseActivity.BaseActivity
import com.food.app.databinding.ActivityHomeBinding
import com.food.app.view.adapter.BookAdapter
import com.food.app.view.adapter.DateAdapter
import com.food.app.view.adapter.FilterAdapter
import com.food.app.view.adapter.RejectAdapter
import com.food.app.view.adapter.Upcomingadapter
import com.food.app.view.eventmodel.BookeventMOdel
import com.food.app.view.responsemodel.Bookingmodel
import com.food.app.view.responsemodel.Datemodel
import com.food.app.view.responsemodel.FilterMOdel
import com.food.app.view.responsemodel.RejectModel
import com.food.app.view.responsemodel.UpcomingModel
import com.kotlintest.app.utility.interFace.CommonInterface
import kotlinx.android.synthetic.main.bookingadapter.time
import kotlinx.android.synthetic.main.dialog.accept
import kotlinx.android.synthetic.main.dialog.cancel
import kotlinx.android.synthetic.main.dialog.customertime
import kotlinx.android.synthetic.main.dialog.date
import kotlinx.android.synthetic.main.dialog.deposit
import kotlinx.android.synthetic.main.dialog.name
import kotlinx.android.synthetic.main.dialog.people
import kotlinx.android.synthetic.main.dialog.phoneno
import org.greenrobot.eventbus.EventBus


class Homeactivity : BaseActivity<ActivityHomeBinding>() {
    lateinit var drawerLayout: DrawerLayout
    var rejectlist: ArrayList<RejectModel> = ArrayList()
    var upcominglist: ArrayList<UpcomingModel> = ArrayList()
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun getLayoutId(): Int = R.layout.activity_home
    override fun initView(mViewDataBinding: ViewDataBinding?) {
        adapter()
        this.mViewDataBinding.apply {
            menuimg.setOnClickListener {
                drawerLayout.openDrawer(navigationview)
            }
        }
        drawerLayout = findViewById(R.id.my_drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    fun adapter() {
        var datelist: ArrayList<Datemodel> = ArrayList()
        datelist.add(Datemodel("Today", "Jun  2"))
        datelist.add(Datemodel("Tomorrow", "Jun  3"))
        datelist.add(Datemodel("Monday", "Jun  4"))
        datelist.add(Datemodel("Tuesday", "Jun  5"))
        datelist.add(Datemodel("Wednesday", "Jun  6"))
        datelist.add(Datemodel("Thursday", "Jun  7"))
        datelist.add(Datemodel("Friday", "Jun  8"))

        val dateadapter = DateAdapter(datelist, object : CommonInterface {
            override fun commonCallback(any: Any) {


            }

        })

        this.mViewDataBinding.daterv.adapter = dateadapter


        var filterlist: ArrayList<FilterMOdel> = ArrayList()
        filterlist.add(FilterMOdel("Waiting For Confirmation", R.drawable.ic_clk))
        filterlist.add(FilterMOdel("Upcoming Confirmation", R.drawable.upcoming))
        filterlist.add(FilterMOdel("Rejected", R.drawable.upcoming))
        val filterAdapter = FilterAdapter(filterlist, object : CommonInterface {
            override fun commonCallback(any: Any) {

                println("print__________" + any.toString())

                if (any.equals(0)) {
                    mViewDataBinding.bookingrv.visibility = View.VISIBLE
                    mViewDataBinding.upcomingrv.visibility = View.GONE
                    mViewDataBinding.rejectrv.visibility = View.GONE
                } else if (any.equals(1)) {
                    mViewDataBinding.bookingrv.visibility = View.GONE
                    mViewDataBinding.upcomingrv.visibility = View.VISIBLE
                    mViewDataBinding.rejectrv.visibility = View.GONE
                } else if (any.equals(2)) {
                    mViewDataBinding.bookingrv.visibility = View.GONE
                    mViewDataBinding.upcomingrv.visibility = View.GONE
                    mViewDataBinding.rejectrv.visibility = View.VISIBLE
                } else {
                    mViewDataBinding.bookingrv.visibility = View.VISIBLE
                    mViewDataBinding.upcomingrv.visibility = View.GONE
                    mViewDataBinding.rejectrv.visibility = View.GONE
                }


            }

        })

        this.mViewDataBinding.filterv.adapter = filterAdapter
        var bookinglist: ArrayList<Bookingmodel> = ArrayList()
        bookinglist.add(Bookingmodel("02.00Am", "Udhaya", "9898989895", "Today", "2", "cash"))
        bookinglist.add(Bookingmodel("04.00Am", "Kumar", "9598978451", "Tommorrow", "7", "cash"))
        bookinglist.add(Bookingmodel("05.00Am", "mani", "9596959594", "Monday", "6", "cash"))
        bookinglist.add(Bookingmodel("03.00Am", "muthu", "9695989798", "Tuesday", "4", "cash"))


        val bookAdapter = BookAdapter(bookinglist, object : CommonInterface {
            override fun commonCallback(any: Any) {
                when (any) {
                    is HashMap<*, *> -> {
                        val dialog = Dialog(activity)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                        dialog.setCanceledOnTouchOutside(false)
                        dialog.setContentView(R.layout.dialog)
                        dialog.phoneno.text = any.get("phone").toString()
                        dialog.customertime.text = any.get("timeee").toString()
                        dialog.name.text = any.get("name").toString()
                        dialog.date.text = any.get("date").toString()
                        dialog.people.text = any.get("people").toString()
                        dialog.deposit.text = any.get("deposite").toString()

                        dialog.accept.setOnClickListener {
                            EventBus.getDefault().post(BookeventMOdel(any.get("position").toString()))
                            upcominglist.add(
                                UpcomingModel(
                                    any.get("timeee").toString(),
                                    any.get("name").toString(),
                                    any.get("phone").toString(),
                                    any.get("date").toString(),
                                    any.get("people").toString(),
                                    any.get("deposite").toString()
                                )
                            )

                            val upcomingadapter =
                                Upcomingadapter(upcominglist, object : CommonInterface {
                                    override fun commonCallback(any: Any) {


                                    }
                                })

                            mViewDataBinding.upcomingrv.adapter = upcomingadapter
                            dialog.dismiss()
                        }
                        dialog.cancel.setOnClickListener {
                            EventBus.getDefault().post(BookeventMOdel(any.get("position").toString()))
                            rejectlist.add(
                                RejectModel(
                                    any.get("timeee").toString(),
                                    any.get("name").toString(),
                                    any.get("phone").toString(),
                                    any.get("date").toString(),
                                    any.get("people").toString(),
                                    any.get("deposite").toString()
                                )
                            )

                            val rejectAdapter =
                                RejectAdapter(rejectlist, object : CommonInterface {
                                    override fun commonCallback(any: Any) {


                                    }
                                })

                            mViewDataBinding.rejectrv.adapter = rejectAdapter

                            dialog.dismiss()
                        }

                        dialog.show()
                    }
                }
            }

        })

        this.mViewDataBinding.bookingrv.adapter = bookAdapter


    }


}
