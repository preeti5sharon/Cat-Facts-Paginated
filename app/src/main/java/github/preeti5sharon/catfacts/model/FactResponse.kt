package github.preeti5sharon.catfacts.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FactResponse(
    @Json(name = "current_page")
    val currentPage: Int?,
    val `data`: List<Data?>?,
    @Json(name = "first_page_url")
    val firstPageUrl: String?,
    val from: Int?,
    @Json(name = "last_page")
    val lastPage: Int?,
    @Json(name = "last_page_url")
    val lastPageUrl: String?,
    val links: List<Link?>?,
    @Json(name = "next_page_url")
    val nextPageUrl: String?,
    val path: String?,
    @Json(name = "per_page")
    val perPage: String?,
    @Json(name = "prev_page_url")
    val prevPageUrl: Any?,
    val to: Int?,
    val total: Int?
)