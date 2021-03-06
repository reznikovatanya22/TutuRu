package com.tanyareznikova.tuturu.presentation.user_detail

import com.tanyareznikova.tuturu.domain.model.UserDetailModel

data class UserDetailState(
    val isLoading: Boolean = false,
    val user: UserDetailModel? = null,
    val error: String = ""
)
