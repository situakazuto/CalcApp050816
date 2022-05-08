package jp.techacademy.toduka.atsushi.calcapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getIntExtra("VALUE1", 10)
        val value2 = intent.getIntExtra("VALUE2", 20)

        textView.text = "${value1 + value2}"
    }
}