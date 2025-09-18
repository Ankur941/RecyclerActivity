package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        //TODO Step 4: Provide a RecyclerView.Adapter
        val fontSizes = (12..40 step 2).toList()
        recyclerView.adapter = NumberDisplayAdapter(fontSizes)
    } }// <--- ADD THIS CLOSING BRACE

/*class MyRecyclerViewAdapter(private val items: Array<String>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {
    // ...
}*/
    /*class MyRecyclerViewAdapter(private val items: Array<String>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {
            class MyViewHolder(TextView: View) : RecyclerView.ViewHolder(textView){

            }

            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): MyViewHolder {
                return MyViewHolder(
                    TextView()
            }

            override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

            }

            override fun getItemCount(): Int {
                return items.size
            }
        }*/



