package com.example.listviewperbaikan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Type>()

        list.add(Type("Presiden Pertama", "Ir.Soekarno", R.drawable.sukarno))
        list.add(Type("Presiden Kedua", "Jend. TNI Purn. H.M. Soeharto", R.drawable.suharto))
        list.add(Type("Preside Ketiga", "Bj Habibie", R.drawable.bjhabibie))
        list.add(Type("Presiden Keempat", "Abdurahman Wahid", R.drawable.gusdur))
        list.add(Type("Presiden Kelima", "Megawati Soekarno Puteri", R.drawable.megawati))
        list.add(Type("Presiden Keenam", "Susilo Bambang Yudhoyono", R.drawable.sby))
        list.add(Type("Presiden Ketujuh", "Joko Widodo", R.drawable.jokowi))

        listview.adapter = listadapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                val intent= Intent(this, soekarno::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                val intent= Intent(this, soeharto::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                val intent= Intent(this, habibie::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                val intent= Intent(this, gusdur::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                val intent= Intent(this, megawati::class.java)
                startActivity(intent)

            }
            if (position == 5) {
                val intent= Intent(this, sby::class.java)
                startActivity(intent)
            }
            if (position == 6) {
                val intent= Intent(this, jokowidodo::class.java)
                startActivity(intent)
            }
        }
    }
}