package com.example.navigationdemo.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.navigationdemo.R
import com.example.navigationdemo.entity.MenuItem

class MenuListAdapter : BaseQuickAdapter<MenuItem, BaseViewHolder>(R.layout.item_menu) {
    init {
        setOnItemClickListener { _, _, position ->
            data[position].action?.invoke()
        }
    }

    override fun convert(helper: BaseViewHolder, item: MenuItem) {
        helper.setText(R.id.tv_title, item.text ?: "")
    }
}