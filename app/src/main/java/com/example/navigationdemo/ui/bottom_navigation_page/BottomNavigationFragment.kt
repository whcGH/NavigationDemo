package com.example.navigationdemo.ui.bottom_navigation_page

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_bottom_navigation.*

class BottomNavigationFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_bottom_navigation
    }

    override fun initView() {
        vp_container.adapter = NavigationPagerAdapter(childFragmentManager)

        bottom.setupWithNavController(findNavController())
        bottom.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.tab1 -> vp_container.currentItem = 0
                R.id.tab2 -> vp_container.currentItem = 1
                R.id.tab3 -> vp_container.currentItem = 2
            }
            true
        }
    }
}

class NavigationPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> BottomNavigationPage1Fragment()
            1 -> BottomNavigationPage2Fragment()
            2 -> BottomNavigationPage3Fragment()
            else -> throw IndexOutOfBoundsException()
        }
    }

    override fun getCount(): Int {
        return 3
    }
    fun select(){

    }
}