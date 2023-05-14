package co.com.sebuscan.missing.people.persistance

import co.com.sebuscan.missing.people.persistance.entity.CommentsEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentsRepository:JpaRepository<CommentsEntity,Int> {
    fun findAllByMissingPersonId(missingPersonId:Int): List<CommentsEntity>
}