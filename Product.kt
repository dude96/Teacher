package com.example.teacher


class Product(string:String) {
    var price: Double = 00.00
    var name: String = ""
    var idCode: Int = 0
    var productWanted: Int = 0
    var amount:Int = 0
    var person:String = ""
    var manufacturingCountry: String = ""


    constructor(price:Double,name:String,idCode:Int,productWanted:Int,manufacturingCountry:String,amount:Int):this(name){

        this.price = price
        this.name = name
        this.idCode = idCode
        this.productWanted = productWanted
        this.manufacturingCountry = manufacturingCountry
        this.amount = amount


    }

}