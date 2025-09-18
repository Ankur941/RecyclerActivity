package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

/*class NumberDisplayAdapter /* TODO Step 3a: Provide Adapter Parent */ {
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()
    {


        class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {}

        // TODO Step 3b: Complete function definitions for adapter
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): MyViewHolder {
            return MyViewHolder(
                TextView()
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val items = items[position]
        }

        override fun getItemCount(): Int = items.size
    }

}*/

class NumberDisplayAdapter(private val numbers: List<Int>) :
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    // ViewHolder: wraps a TextView
    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    // Step 3b-1: Create new views (invoked by LayoutManager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false) as TextView
        return NumberViewHolder(textView)
    }

    // Step 3b-2: Bind the data (called for each item)
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = numbers[position]
        holder.textView.text = "Number $number"
        holder.textView.textSize = (12 + number).toFloat() // 👈 makes font grow
    }

    // Step 3b-3: Return item count
    override fun getItemCount(): Int = numbers.size
}