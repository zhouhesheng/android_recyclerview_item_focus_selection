package com.example.recyclerviewitemfocus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topics = listOf(
            "Education",
            "Finance",
            "Government",
            "Entertainment",
            "Technology",
            "Math",
            "Biology",
            "Physics",
            "Chemistry",
            "Space",
            "Sports",
            "Music",
            "Animal",
            "Countries",
            "Weather",
            "Politics",
            "Traffic",
            "Poverty",
            "Social Media",
            "Internet",
            "Housing"
        )
        val gridLayoutManager = GridLayoutManager(this, 6, RecyclerView.VERTICAL, false)
        val listAdapter = ItemListAdapter(topics)

        recycler_view.layoutManager = gridLayoutManager
        recycler_view.adapter = listAdapter
    }
}
