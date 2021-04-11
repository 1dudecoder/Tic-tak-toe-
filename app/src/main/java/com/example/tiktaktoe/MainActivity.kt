 package com.example.tiktaktoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import org.intellij.lang.annotations.RegExp
import org.w3c.dom.Text

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


     fun btnclick(view: View){
         val but = view as Button
         var call = 0

         when(but.id) {
             R.id.button1 -> call = 1
             R.id.button2 -> call = 2
             R.id.button3 -> call = 3
             R.id.button4 -> call = 4
             R.id.button5 -> call = 5
             R.id.button6 -> call = 6
             R.id.button7 -> call = 7
             R.id.button8 -> call = 8
             R.id.button9 -> call = 9
         }

         //Toast.makeText(this , "$call" + " button is clicked but user ", Toast.LENGTH_SHORT).show()
         setbtn(but,call)
     }


     var player1 = ArrayList<Int>()
     var player2 = ArrayList<Int>()

     var chance = 1

     private fun setbtn(but: Button, call: Int) {

         if(chance == 1){
             but.text = "X"
             but.setBackgroundColor(Color.parseColor("#089193"))
             player1.add(call)
             chance = 2
         }else{
             but.text = "O"
             but.setBackgroundColor(Color.parseColor("#FF9300"))
             player2.add(call)
             chance = 1
         }


         win()
         but.isEnabled = false
     }



     private fun win() {

         val result:TextView = findViewById(R.id.winner)
         var findwinner = 0

         //plaayer1 winning code
         if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
             findwinner = 1
         }

         if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
             findwinner = 2
         }


         if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
             findwinner = 1
         }
         if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
             findwinner = 2
         }


         if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
             findwinner = 1
         }
         if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
             findwinner = 2
         }


         if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
             findwinner = 1
         }
         if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
             findwinner = 2
         }


         if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
             findwinner = 1
         }
         if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
             findwinner = 2
         }

         if(player1.contains(3) && player1.contains(5) && player1.contains(8)){
             findwinner = 1
         }
         if(player2.contains(3) && player2.contains(5) && player2.contains(8)){
             findwinner = 2
         }
         if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
             findwinner = 1
         }
         if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
             findwinner = 2
         }
         if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
             findwinner = 1
         }
         if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
             findwinner = 2
         }


     if(findwinner != 0){
         if(findwinner == 1){

             //player 1 wins
            // Toast.makeText(this, "player 1 is winner of the game",Toast.LENGTH_LONG).show()
                result.setText("player 1 Wins")
         }else{
             //player 2 wins
            //Toast.makeText(this, "player 2 is winner of the game",Toast.LENGTH_LONG).show()
             result.setText("player 2 Wins")
             }
        }

     }

     fun reset(view: View) {
         val intent = intent
         finish()
         startActivity(intent)
     }
 }