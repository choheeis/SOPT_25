package com.example.homework3.data

import com.google.gson.annotations.SerializedName

data class GitrepositoryItemData (
    @SerializedName("name")
    val name : String,
    @SerializedName("description")
    val description : String,
    @SerializedName("language")
    val language : String?
)

