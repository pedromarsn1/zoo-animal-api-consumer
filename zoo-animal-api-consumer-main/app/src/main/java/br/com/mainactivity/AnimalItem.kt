package br.com.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import br.com.mainactivity.databinding.AnimalItemBinding

class AnimalItem : AppCompatActivity() {

    lateinit var binding : AnimalItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_item)
    }
}