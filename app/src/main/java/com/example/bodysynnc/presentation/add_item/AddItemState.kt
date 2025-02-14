package com.example.bodysynnc.presentation.add_item

import com.example.bodysynnc.domain.model.BodyPart

data class AddItemState(
    val textFieldValue: String = "",
    val selectedBodyPart: BodyPart? = null,
    val bodyParts: List<BodyPart> = emptyList()
)