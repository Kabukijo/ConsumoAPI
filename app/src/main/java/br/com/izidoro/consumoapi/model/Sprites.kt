package br.com.izidoro.consumoapi.model

import com.google.gson.annotations.SerializedName

data class Sprites(
        @SerializedName("front_default")
        val frontDefault: String
)