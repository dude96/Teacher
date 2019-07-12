package com.example.teacher

class Book {
    var title:String = ""
    var pages:Int = 0
    var auther:String = ""
    var language:String = ""
            constructor(title:String,pages:Int,auther:String,language:String){
                this.title = title
                this.pages = pages
                this.auther = auther
                this.language = language
            }
}