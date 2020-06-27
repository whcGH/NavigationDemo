package com.example.navigationdemo.ui.share_element

import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.AutoTransition
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_share_element01.*

class ShareElement01Fragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_share_element01

    override fun initView() {
        btn_go_next.setOnClickListener {
            sharedElementEnterTransition = AutoTransition()
            sharedElementReturnTransition = AutoTransition()
            val extra = FragmentNavigatorExtras(tv_title to "title")
            findNavController().navigate(
                R.id.action_shareElement01Fragment_to_shareElement02Fragment,
                null,
                null,
                extra
            )
        }
    }
}