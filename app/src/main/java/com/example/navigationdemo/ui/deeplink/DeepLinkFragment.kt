package com.example.navigationdemo.ui.deeplink

import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_target.*

class DeepLinkFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target

    override fun initView() {
        tv_content.text = "this is a deep link page"
    }
}