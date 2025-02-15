package com.example.bodysynnc.presentation.dashboard

import com.example.bodysynnc.domain.model.BodyPart
import com.example.bodysynnc.domain.model.User

data class DashboardState(
    val user: User? = null,
    val bodyParts: List<BodyPart> = emptyList(),
    val isSignOutButtonLoading: Boolean = false,
    val isSignInButtonLoading: Boolean = false,
)