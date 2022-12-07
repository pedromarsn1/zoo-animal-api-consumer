package br.com.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.mainactivity.databinding.ActivityMainBinding
import br.com.mainactivity.model.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val call :Call<List<Animal>>? = RetrofitClient.instance?.getApi()?.getAnimals()
        call?.enqueue(object : Callback<List<Animal>>{
            override fun onResponse(call: Call<List<Animal>>, response: Response<List<Animal>>) {

                if (response.isSuccessful){
                    response.body().let {
                        binding.listAnimals.adapter = AnimalAdapter(it as ArrayList<Animal>)
                        binding.listAnimals.layoutManager = LinearLayoutManager(this@MainActivity)
                        binding.progressBar1.visibility = View.GONE
                        binding.listAnimals.visibility = View.VISIBLE
                    }
                }
            }

            override fun onFailure(call: Call<List<Animal>>, t: Throwable) {
                binding.progressBar1.visibility = View.GONE
                binding.error.text = "Eita! tenta novamente mais tarde, deu um probleminha aqui!"
                binding.error.visibility = View.VISIBLE
            }

        })
    }
}