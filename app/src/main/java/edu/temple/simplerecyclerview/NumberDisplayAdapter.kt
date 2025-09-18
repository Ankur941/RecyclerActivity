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


    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false) as TextView
        return NumberViewHolder(textView)
    }


    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = numbers[position]
        holder.textView.text = "Font  $number"
        holder.textView.textSize = (12 + number).toFloat()
    }


    override fun getItemCount(): Int = numbers.size
}