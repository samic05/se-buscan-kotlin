package co.com.sebuscan.missing.people.persistance.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "MissingPeople")
data class MissingPeopleEntity(
    @Id
    val code:Int,
    val name:String,
    val lastName:String,
    val city: String,
    val dateOfBirth: String,
    val dateOfDisappearance: String,
    val gender: String,
    val height: String,
    val build: String,
    val race: String,
    val comment: String,
)
