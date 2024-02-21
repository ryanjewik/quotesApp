package com.example.dailyquotesapp.data

import com.example.dailyquotesapp.R
import com.example.dailyquotesapp.model.Quote

class DataSource {

    fun loadQuotes(): List<Quote>{
        return listOf<Quote>(
            Quote(R.string.q1,R.string.a1, R.drawable.img1),
            Quote(R.string.q2,R.string.a2, R.drawable.img2),
            Quote(R.string.q3,R.string.a3, R.drawable.img3),
            Quote(R.string.q4,R.string.a4, R.drawable.img4),
            Quote(R.string.q5,R.string.a5, R.drawable.img5),
            Quote(R.string.q6,R.string.a6, R.drawable.img6),
            Quote(R.string.q7,R.string.a7, R.drawable.img7),
            Quote(R.string.q8,R.string.a8, R.drawable.img8),
            Quote(R.string.q9,R.string.a9, R.drawable.img9),
            Quote(R.string.q10,R.string.a10, R.drawable.img10)
        )
    }

}