package com.example.navigationdemo.ui.target

import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_target.*

class TargetWithArgFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target

    override fun initView() {
        arguments
        val textArg = arguments?.getString("textArg")
        val intArg = arguments?.getInt("intArg")
        tv_content.text = "received argument textArg = $textArg ,intArg = $intArg"
    }
}