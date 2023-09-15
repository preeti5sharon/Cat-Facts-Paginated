package github.preeti5sharon.catfacts.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val fact: String?,
    val length: Int?
)