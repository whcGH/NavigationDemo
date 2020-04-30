package com.example.navigationdemo.ui

import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import com.example.navigationdemo.entity.MenuItem
import com.example.navigationdemo.ui.adapter.MenuListAdapter
import kotlinx.android.synthetic.main.fragment_menu_list.*

class HomePageFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_menu_list
    private val adapter by lazy {
        MenuListAdapter()
    }

    override fun initView() {
        recycler_view.adapter = adapter
        adapter.setNewData(
            mutableListOf(
                MenuItem("go next page") {
                    findNavController().navigate(R.id.action_homePageFragment_to_goNextPageSampleFragment)
                }
            )
        )
    }
}