package com.example.teacher

import com.example.myapplication.Person


class Cart {
    var ShoppingList: ArrayList<Product> = ArrayList()
    var buyer: ArrayList<Person> = ArrayList()

    fun getTotalCost(): Double {
        var tCost = ArrayList<Double>()
        var price = 0.0
        for (i in 0 until ShoppingList.size) {
            var _cost = ShoppingList[i]
            var _amount = ShoppingList[i]
            price = (_amount.amount) * (_cost.price)
        }
        return price
    }


    fun getTotalItems(): ArrayList<Product> {
        var gTI = ArrayList<Product>()
        var paw = 0
        for (i in 0 until ShoppingList.size) {
            var _amount: Product = ShoppingList[i]
            var _cost: Product = ShoppingList[i]
            paw = (_cost.productWanted) * (_amount.amount)
            return gTI
        }
        fun addItem(product: Product) {
            ShoppingList.add(product)

        }

        fun getMadeIn(): ArrayList<Product> {
            var mIn = ArrayList<Product>()
            for (i in 0 until ShoppingList.size) {
                var correntShopping = ShoppingList[i]
                if (correntShopping.manufacturingCountry == "Made In Israel")
                    return (mIn)


            }
            return (mIn)
        }
        return ShoppingList
        }}


