package com.plasius.dailymotivationalquotes.model

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("status")
    var status: String,

    @SerializedName("token")
    var authToken: String,

    @SerializedName("user")
    var user: User
)