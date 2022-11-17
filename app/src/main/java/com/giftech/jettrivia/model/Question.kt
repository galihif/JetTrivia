package com.giftech.jettrivia.model


import com.google.gson.annotations.SerializedName

class Question : ArrayList<QuestionItem>()

data class QuestionItem(
    @SerializedName("answer")
    val answer: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("choices")
    val choices: List<String>,
    @SerializedName("question")
    val question: String
)