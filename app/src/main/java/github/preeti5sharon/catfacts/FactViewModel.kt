package github.preeti5sharon.catfacts

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FactViewModel @Inject constructor(private val repository: FactRepository) : ViewModel() {
    private val pageConfig = PagingConfig(10, 10, false, 10)
    fun getFacts() = Pager(pageConfig, 0) {
        FactPagingSource(repository)
    }
}
