package com.gerald.uicomponents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.CompoundButtonCompat
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgmusic = findViewById<ImageView>(R.id.spotify)
        var original = true
        val checkfree = findViewById<CheckBox>(R.id.checkBoxFree)
        val checkPremium = findViewById<CheckBox>(R.id.checkBoxPremium)
        val toggleMobile = findViewById<ToggleButton>(R.id.toggleButtonMobiledata)
        val switchDisplay = findViewById<Switch>(R.id.switchdarkMode)
        val groupGenre = findViewById<RadioGroup>(R.id.groupGenre)


        imgmusic.setOnClickListener{
            if (original){
                imgmusic.setImageResource(R.drawable.tiktok)
                original=false
            }else{
                imgmusic.setImageResource(R.drawable.spotify)
                original =true
            }
        }
        checkfree.setOnCheckedChangeListener{_,isChecked ->
        if(isChecked)
        {
            Toast.makeText(this,"You want to listen for free",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"You have opted for premium",Toast.LENGTH_SHORT).show()
        }


        }
        toggleMobile.setOnCheckedChangeListener { _, isTurnedOn ->
            if (isTurnedOn){
                Toast.makeText(this,"Mobile data is on",Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this,"Mobile Data is Off",Toast.LENGTH_SHORT).show()
            }
        }
        switchDisplay.setOnCheckedChangeListener { _,isSwitched ->
            if (isSwitched){
                Toast.makeText(this,"Mobile data is on",Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this,"Mobile Data is Off",Toast.LENGTH_SHORT).show()
            }

        }
        groupGenre.setOnCheckedChangeListener { _, id ->
            if (id == R.id.radioHipHop){
                Toast.makeText(this, "Select your favourite hiphop artist", Toast.LENGTH_SHORT).show()
            }else if (id ==R.id.radioRB){
                Toast.makeText(this, "Select your favourite R&B artist", Toast.LENGTH_SHORT).show()
            }else if (id == R.id.radioModdy){
                Toast.makeText(this, "Select your favourite Moddy Artist", Toast.LENGTH_SHORT).show()
            }
        }

        //var should be in small letters and constants to be in capital e.g

}
}


