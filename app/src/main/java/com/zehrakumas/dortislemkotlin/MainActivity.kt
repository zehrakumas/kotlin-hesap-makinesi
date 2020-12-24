package com.zehrakumas.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view:View) {
        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2==null){
            textView.text="Sayi girmeyi unutmayiniz!"
        }else{
            textView.text="Sonuc:${sayi1+sayi2}"
        }


    }
    fun cikar(view: View){

        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2==null){
            textView.text="Sayi girmeyi unutmayiniz!"
        }else{
            textView.text="Sonuc:${sayi1-sayi2}"
        }
    }
    fun bol(view: View){

        var sayi1=editText.text.toString().toDoubleOrNull()
        var sayi2=editText2.text.toString().toDoubleOrNull()
        if(sayi1==null || sayi2==null){
            textView.text="Sayi girmeyi unutmayiniz!"
        }else{
            textView.text="Sonuc:${sayi1/sayi2}"
        }
    }
    fun carp(view: View){
        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2==null){
            textView.text="Sayi girmeyi unutmayiniz!"
        }else{
            textView.text="Sonuc:${sayi1*sayi2}"
        }

    }
}