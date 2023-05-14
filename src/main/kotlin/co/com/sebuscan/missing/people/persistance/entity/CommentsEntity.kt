package co.com.sebuscan.missing.people.persistance.entity

import java.time.LocalDateTime
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "comments")
data class CommentsEntity(
    @Id
    val messageId:Int,
    val missingPersonId:Int,
    @Column(name="comment")
    val text:String,
    val dateOfEntry: Date,
    val userId: String?,
    val userEmail: String   ,
)
