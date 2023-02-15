package my.edu.tarc.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

//Class name/Variable Name/ Data Type/Class Type
class MainActivity : AppCompatActivity() {

    //fun -  function
    //onCreate - the main function
    override fun onCreate(savedInstanceState: Bundle?) {
        //super - parent class
        super.onCreate(savedInstanceState)
        //Load the UI file to memory
        //R - resource class
        setContentView(R.layout.activity_main)

        //Declare value variable
        //val = value (static)
        //var = variable
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        val buttonHideName: Button = findViewById(R.id.buttonHideName)

        buttonShowName.setOnClickListener{
            //textViewName.text = "Ong Zi Zhen"
            textViewName.text = getString(R.string.my_name)
            textViewName.visibility = View.VISIBLE
        }

        buttonHideName.setOnClickListener{
            textViewName.visibility = View.INVISIBLE
        }
    }
}