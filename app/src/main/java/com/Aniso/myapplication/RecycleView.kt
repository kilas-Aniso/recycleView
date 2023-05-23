package com.Aniso.myapplication


class RecyclerViewAdapter(private val fibonacciNumbers: List<Int>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fibonacci_number, parent, false)
        return ViewHolder(view)
    }

    fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.numberTextView.text = fibonacciNumbers[position].toString()
    }

    fun getItemCount(): Int {
        return fibonacciNumbers.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.numberTextView)
    }}


