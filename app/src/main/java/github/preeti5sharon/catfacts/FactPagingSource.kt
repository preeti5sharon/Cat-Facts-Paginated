package github.preeti5sharon.catfacts

import androidx.paging.PagingSource
import androidx.paging.PagingState
import github.preeti5sharon.catfacts.model.Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FactPagingSource(private val repository: FactRepository) : PagingSource<Int, Data>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Data> =
        withContext(Dispatchers.IO) {
            val page = params.key ?: 1
            val limit = params.loadSize
            val response = repository.getFacts(limit, page).body()
            val nextPage = if (response?.nextPageUrl != null) page + 1 else null
            LoadResult.Page(response?.data?.filterNotNull().orEmpty(), null, nextPage)
        }

    override fun getRefreshKey(state: PagingState<Int, Data>): Int? {
        return null
    }
}
