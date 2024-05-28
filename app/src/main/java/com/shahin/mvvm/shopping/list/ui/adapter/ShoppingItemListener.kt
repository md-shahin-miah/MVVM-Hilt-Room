package com.shahin.mvvm.shopping.list.ui.adapter

import com.shahin.mvvm.shopping.list.db.entities.ShoppingItem

interface ShoppingItemListener {
    fun updateShoppingItem(item: ShoppingItem)
    fun onDeleteClick(item: ShoppingItem)
}