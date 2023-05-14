package co.com.sebuscan.missing.people.service

import co.com.sebuscan.missing.people.mapper.CommonMapper
import co.com.sebuscan.missing.people.persistance.MissingPeopleRepository
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import org.springframework.stereotype.Service

@Service
class MissingPeopleService(
    private val missingPeopleRepository: MissingPeopleRepository,
    private val persistanceMapper: CommonMapper<MissingPeopleModel, MissingPeopleEntity>
):LookSaveAndRandom<MissingPeopleModel> {
    override fun lookById(id: Int): MissingPeopleModel {
      var entity =  missingPeopleRepository.findById(id)
        return persistanceMapper.output(entity.get())

    }

    override fun lookAllById(id: Int): List<MissingPeopleModel> = listOf(lookById(id))

    override fun getRandomEntries(count: Int): List<MissingPeopleModel> {
      var list =  missingPeopleRepository.findAll()
        return list.asSequence().shuffled().take(count).toList().map { persistanceMapper.output(it) }
    }

    override fun save(model: MissingPeopleModel): Boolean {
        TODO("Not yet implemented")
    }
}