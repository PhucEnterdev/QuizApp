package vn.com.enterdev.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_welcome.*
import vn.com.enterdev.R
import vn.com.enterdev.singleton.Constants

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_start.setOnClickListener {
            if (edt_name.text?.isEmpty() == true){
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            }else{
                val intent : Intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, edt_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}