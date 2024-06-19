package com.example.fod


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Cart {
    private val _items = MutableLiveData<List<Item>>(emptyList())
    val items: LiveData<List<Item>> get() = _items

    fun addItem(item: Item) {
        _items.value = _items.value?.plus(item)
    }

    fun removeItem(item: Item) {
        _items.value = _items.value?.minus(item)
    }
}
