package com.example.teacher
import android.util.Log



class library {
    var BookList: ArrayList<Book> = ArrayList()
    var manager: Manager = Manager()


    fun getAllEnglishBooks():ArrayList<Book>{
    var eBook= ArrayList<Book>()
        for(i in 0 until BookList.size){
            var correntBook = BookList[i]
            if (correntBook.language =="English")
                eBook.add(correntBook)



        }
        return eBook
}
    fun getBookTitle():ArrayList<String>{
    var tBook = ArrayList<String>()
        for (i in 0 until tBook.size){
            tBook.add(BookList[i].title)}
            return tBook
        }
        fun getBookOver300(): ArrayList<Book> {
            var oBook = ArrayList<Book>()
            for (i in 0 until BookList.size) {
                oBook.add(BookList[i])
                if (BookList[i].pages > 300) {
                    oBook.add(BookList[i])
                    Log.d("test", "has more than 300 pages{BookList[i].pages}")
                }
                return oBook


            }

            fun getAllAutherName(): ArrayList<String> {
                var aBook = ArrayList<String>()
                for (i in 0 until aBook.size) {
                    aBook.add(BookList[i].auther)
                }


                return aBook
            }
        return oBook}}





