package co.com.sebuscan.missing.people.service

import co.com.sebuscan.missing.people.mapper.CommonMapper
import co.com.sebuscan.missing.people.persistance.CommentsRepository
import co.com.sebuscan.missing.people.persistance.MissingPeopleRepository
import co.com.sebuscan.missing.people.persistance.entity.CommentsEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import co.com.sebuscan.missing.people.service.model.CommentsModel
import org.springframework.stereotype.Service

@Service
class CommentsService(
    private val commentsRepository: CommentsRepository,
    private val commentsMapper: CommonMapper<CommentsModel, CommentsEntity>
):LookAndSaveService<CommentsModel> {
    override fun lookById(id: Int): CommentsModel {
      var entity =  commentsRepository.findById(id)
        return commentsMapper.output(entity.get())

    }

    override fun lookAllById(id: Int): List<CommentsModel> {
        var comments = commentsRepository.findAllByMissingPersonId(id);
        return comments.map(commentsMapper::output) }

    override fun save(model: CommentsModel): Boolean {
        try {
            commentsRepository.save(commentsMapper.input(model))
            return true;

        }catch (e: Exception){
            return false;
        }
    }
}
