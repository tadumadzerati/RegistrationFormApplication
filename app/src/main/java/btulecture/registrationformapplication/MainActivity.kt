package btulecture.registrationformapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signupButton.setOnClickListener {
            if (FirstNameEdit.text.toString().isEmpty() || LastNameEdit.text.toString().isEmpty() ||
                EmailEdit.text.toString().isEmpty() ||
                PasswordEdit.text.toString().isEmpty() ||
                PasswordConfirmEdit.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "Fill all fields!", Toast.LENGTH_LONG).show()
            } else if (PasswordConfirmEdit.text.toString() !=
                PasswordEdit.text.toString()) {
                Toast.makeText(this, "Password is incorrect", Toast.LENGTH_LONG).show()
            }else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(EmailEdit.text).matches()){
                Toast.makeText(this,"Please enter a valid Email",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Registration successful!",Toast.LENGTH_LONG).show()
            }
        }
    }
}

