package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit  var age:Spinner

    var isMale = false
    var isSmoker = false
    var fee = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener {
            age = findViewById(R.id.spinnerAge)


            if(radioButtonMale.isChecked)
                isMale = true

            if(checkBoxSmoker.isChecked)
                isSmoker = true
            var id: Int = radioGroupGender.checkedRadioButtonId
            if (id!=-1){
                if (age.selectedItemPosition==0){
                    fee = 60
                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }
                else if(age.selectedItemPosition==1){
                    fee = 70
                    if(isMale)
                        fee=fee+50
                    if(isSmoker)
                        fee=fee+100
                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }
                else if(age.selectedItemPosition==2){
                    fee = 90
                    if(isMale)
                        fee=fee+100

                    if(isSmoker)
                        fee=fee+150

                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }
                else if(age.selectedItemPosition==3){
                    fee = 120
                    if(isMale)
                        fee=fee+150
                    if(isSmoker)
                        fee=fee+200
                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }
                else if(age.selectedItemPosition==4){
                    fee = 150
                    if(isMale)
                        fee=fee+200
                    if(isSmoker)
                        fee=fee+250
                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }
                else if(age.selectedItemPosition==5){
                    fee = 150
                    if(isMale)
                        fee=fee+200
                    if(isSmoker)
                        fee=fee+300
                    textViewPremium.setText("Insurance Premium :RM" + fee)
                }

            }else{

                Toast.makeText(applicationContext,"Please select male or female",
                    Toast.LENGTH_SHORT).show()
            }



        }
        buttonReset.setOnClickListener {
            spinnerAge.setSelection(0)
            radioGroupGender.clearCheck()
            checkBoxSmoker.isChecked = false
            textViewPremium.setText("Insurance Premium :")
        }

    }




}
