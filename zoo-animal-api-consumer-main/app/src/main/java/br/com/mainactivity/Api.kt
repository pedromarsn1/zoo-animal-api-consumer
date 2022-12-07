package br.com.mainactivity

import br.com.mainactivity.model.Animal
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    companion object{
        const val BASE_URL = "https://zoo-animal-api.herokuapp.com/"
    }

    @GET("/animals/rand/10")
    fun getAnimals() : Call<List<Animal>>
}