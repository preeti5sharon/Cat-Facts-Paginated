package github.preeti5sharon.catfacts.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Link(
    val active: Boolean?,
    val label: String?,
    val url: String?
)