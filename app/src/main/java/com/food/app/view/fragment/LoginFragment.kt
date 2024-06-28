package com.food.app.view.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.food.app.R
import com.food.app.baseClass.BaseActivity.BaseActivity
import com.food.app.baseClass.BaseFragment
import com.food.app.databinding.FragmentLoginBinding
import com.food.app.databinding.FragmentSampleBinding
import com.food.app.view.activity.Homeactivity

class LoginFragment : BaseFragment<FragmentLoginBinding>(){

    override fun initView(mViewDataBinding: ViewDataBinding?) {
this.mViewDataBinding.apply {
loginbtn.setOnClickListener {
    if(TextUtils.isEmpty(email.text)){
        showToast("please enter your email address")
    }else if(TextUtils.isEmpty(password.text)){
        showToast("please enter your password")
    }else{
        setIntent(Homeactivity::class.java,0)
          }
}


}
    }
    override fun getLayoutId(): Int =R.layout.fragment_login



}
