package co.com.sebuscan.missing.people.service.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import java.util.Date

data class CommentsModel(
    val messageId: Int,
    val missingPersonId: Int,
    @JsonProperty("comment")
    val text: String,
    val dateOfEntry: Date,
    val userId: String?,
    val userEmail: String,
)