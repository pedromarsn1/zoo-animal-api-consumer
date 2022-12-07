package br.com.mainactivity

import androidx.recyclerview.widget.RecyclerView
import br.com.mainactivity.databinding.AnimalItemBinding
import br.com.mainactivity.model.Animal

class AnimalViewHolder(private val binding: AnimalItemBinding):
    RecyclerView.ViewHolder(binding.root) {
    fun bind(animal: Animal){

        binding.name.text = animal.name;
        binding.animalType.text = animal.animal_type;
        binding.diet.text = animal.diet;
        binding.activeTime.text = animal.active_time;
        binding.habitat.text = animal.habitat;
        binding.latinName.text = animal.latin_name;
        binding.maxLength.text = animal.length_max;
        binding.lengthMin.text = animal.length_min;
        binding.lifespan.text = animal.lifespan;
        binding.weightMin.text = animal.weight_min;
        binding.maxWeight.text = animal.weight_max;
        binding.geoRange.text = animal.geo_range;
        binding.imageLink.text = animal.image_link;
    }

}