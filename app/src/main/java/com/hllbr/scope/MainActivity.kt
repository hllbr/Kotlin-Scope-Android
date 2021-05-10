package com.hllbr.scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name = ""//Sınıf içinde tanımlama en çok tercih edilen sınırlamak istersem erişilebilirlik atarım
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun makeSimpson(view : View){
        name = nameText.text.toString()
        var job = jobText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if(age == null){
            age = 0
        }
        val simpson = Simpson("homor","Nuclear",65)
        resultView.text ="Name ${simpson.name},Job ${simpson.job},Age ${simpson.age}"
        /*
        Scope == Kapsam /Bir değişkeni tanımlamış olduğum fonksiyon içerisinde kullanabiliyorum.

         */

    }
    fun scopeExample(view : View){
        //println(name)//name ifadesi diğer fonksiyonun elemanı olduğu için yazdıramıyorum
        //Scope objesi hangi objenin nerden okunabileceğini berlieyen bir durum erişilebilirlik gibi bir durum değil verinin tanımlandığı lokasyondan kaynaklanana bir sınır
        //eğer name ifademi bir fonksiyon içerisinde lokal olarak değil Activitenin altında Global bir lokasyonda tanımlasaydım bu alandan erişimim olacaktı
        println(name)

    }
}