package co.com.sebuscan.missing.people.mapper

import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import org.springframework.stereotype.Component

@Component
class PersistanceMapper: CommonMapper<MissingPeopleModel,MissingPeopleEntity> {
    override fun input(input: MissingPeopleModel): MissingPeopleEntity =
        MissingPeopleEntity(
            input.code,
            input.name,
            input.lastName,
            input.city,
            input.dateOfBirth,
            input.dateOfDisappearance,
            input.gender,
            input.height,
            input.build,
            input.race,
            input.comment,
        )

    override fun output(output: MissingPeopleEntity): MissingPeopleModel = MissingPeopleModel(
        output.code,
        output.name,
        output.lastName,
        output.city,
        output.dateOfBirth,
        output.dateOfDisappearance,
        output.gender,
        output.height,
        output.build,
        output.race,
        output.comment,
    )

}