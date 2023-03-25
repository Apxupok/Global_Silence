package com.example.globalsilence.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.globalsilence.R

class MyAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    /**
    Предоставляет ссылку на используемый тип View (кастомный ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Определение слушателя для View, которое содержится в ViewHolder
            textView = view.findViewById(R.id.textView)
        }
    }

    // Создает новые View (вызывается менеджером макетов)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Создание нового View, которое определяет UI элемента списка
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.assert_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Заменяет содержание View (вызывается менеджером макетов)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Получаем элемент из dataset по данной позиции и заменяем
        // содержание View на этот элемент

        viewHolder.textView.text = dataSet[position]
    }

    // Возвращает размер вашего dataset (вызывается менеджером макетов)
    override fun getItemCount() = dataSet.size

}

