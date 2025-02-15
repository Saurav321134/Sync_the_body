package com.example.syncbody.presentation.dashboard

import com.example.syncbody.domain.model.BodyPart
import com.example.syncbody.domain.model.User

data class DashboardState(
    val user: User? = null,
    val bodyParts: List<BodyPart> = emptyList(),
    val isSignOutButtonLoading: Boolean = false,
    val isSignInButtonLoading: Boolean = false,
)