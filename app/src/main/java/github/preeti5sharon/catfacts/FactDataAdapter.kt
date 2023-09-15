package github.preeti5sharon.catfacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import github.preeti5sharon.catfacts.databinding.RvItemBinding
import github.preeti5sharon.catfacts.model.Data

class FactDataAdapter() : PagingDataAdapter<Data, RecyclerView.ViewHolder>(ListDiffer()) {
    class RvViewHolder(view: View) : RecyclerView.ViewHolder(view)
    class ListDiffer : DiffUtil.ItemCallback<Data>() {
        override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
            return newItem === oldItem
        }

        override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
            return newItem == oldItem
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = RvItemBinding.bind(holder.itemView)
        val item = getItem(position)

        binding.text.text = item?.fact
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return RvViewHolder(view)
    }
}
