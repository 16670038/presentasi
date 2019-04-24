package deniuts.com.presentasi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    internal lateinit var Textkata: EditText
    internal lateinit var Hasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Textkata = findViewById(R.id.Txtkata) as EditText
        Hasil = findViewById(R.id.Label2) as TextView
    }

    fun TampilNama(v: View) {
        Hasil.text = "Nama Anda: " + Textkata.getText()
    }


}