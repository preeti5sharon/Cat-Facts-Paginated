package github.preeti5sharon.catfacts

class FactRepository(private val service: FactService) {
    suspend fun getFacts(limit: Int, page: Int) = service.getFacts(limit, page)
}
