package com.poonam.simplymockito.feature.dataimport com.google.gson.annotations.SerializedNamedata class GitUserProfileResponse(    @SerializedName("name")    val name : String = "",    @SerializedName("login")    val login : String = "",    @SerializedName("avatar_url")    val avatar_url : String = "",    @SerializedName("bio")    val bio : String = "",    @SerializedName("public_repos")    val public_repos : Int = 0,    @SerializedName("followers")    val followers : Int = 0,    @SerializedName("following")    val following : Int = 0)