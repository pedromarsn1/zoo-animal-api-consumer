package br.com.mainactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.mainactivity.databinding.AnimalItemBinding
import br.com.mainactivity.model.Animal

class AnimalAdapter(private val animal: ArrayList<Animal>):
    RecyclerView.Adapter<AnimalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        val binding = AnimalItemBinding.bind(view)
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animal[position])
    }

    override fun getItemCount(): Int = animal.size

    }

