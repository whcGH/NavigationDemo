package com.example.navigationdemo.ui

import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.NavigationUiSampleDirections
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import com.example.navigationdemo.entity.MenuItem
import com.example.navigationdemo.ui.adapter.MenuListAdapter
import kotlinx.android.synthetic.main.fragment_menu_list.*

class NavigationUiSampleFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_menu_list
    private val adapter by lazy {
        MenuListAdapter()
    }

    override fun initView() {
        recycler_view.adapter = adapter
        adapter.setNewData(
            mutableListOf(
                MenuItem("show bottom navigation view") {
                    val action =
                        NavigationUiSampleFragmentDirections.actionNavigationUiSampleFragmentToBottomNavigationFragment()
                    findNavController().navigate(action, defaultAnimOption)
                },
                MenuItem("go next page with fragment transition") {
                    val action =
                        NavigationUiSampleFragmentDirections.actionNavigationUiSampleFragmentToBottomNavigationFragment()
                    findNavController().navigate(action, fragmentTransition)
                },
                MenuItem("go next with extra") {
                    val action =
                        NavigationUiSampleFragmentDirections.actionNavigationUiSampleFragmentToShareElement01Fragment()
                    findNavController().navigate(action, fragmentTransition)
                }
            )
        )
    }
}