package co.com.sebuscan.missing.people.mapper

import co.com.sebuscan.missing.people.persistance.entity.CommentsEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import co.com.sebuscan.missing.people.service.model.CommentsModel
import org.springframework.stereotype.Component

@Component
class CommentsMapper: CommonMapper<CommentsModel, CommentsEntity> {
    override fun input(input: CommentsModel): CommentsEntity = CommentsEntity(
        input.messageId,
        input.missingPersonId,
        input.text,
        input.dateOfEntry,
        input.userId,
        input.userEmail
    )

    override fun output(output: CommentsEntity): CommentsModel = CommentsModel(
        output.messageId,
        output.missingPersonId,
        output.text,
        output.dateOfEntry,
        output.userId,
        output.userEmail
    )

}