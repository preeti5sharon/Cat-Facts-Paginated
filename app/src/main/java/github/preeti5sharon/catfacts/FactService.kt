package github.preeti5sharon.catfacts

import github.preeti5sharon.catfacts.model.FactResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FactService {
    @GET("facts")
    suspend fun getFacts(
        @Query("limit") limit: Int = 10,
        @Query("page") page: Int = 1,
    ): Response<FactResponse>
}
