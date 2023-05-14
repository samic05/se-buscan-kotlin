package co.com.sebuscan.missing.people.controller

import co.com.sebuscan.missing.people.persistance.MissingPeopleRepository
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import co.com.sebuscan.missing.people.service.LookAndSaveService
import co.com.sebuscan.missing.people.service.LookSaveAndRandom
import co.com.sebuscan.missing.people.service.model.CommentsModel
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import java.io.BufferedReader
import java.io.FileReader

@RestController
@RequestMapping("/missing")
class CommentsController(
    private val commentsService: LookAndSaveService<CommentsModel>,
) {
    @CrossOrigin
    @GetMapping("/comments/{postId}")
    fun getById(
        @PathVariable(name = "postId", required = true)
        postId:String
    ): ResponseEntity<List<CommentsModel>> =  ResponseEntity.ok(commentsService.lookAllById(postId.toInt()));

    @CrossOrigin
    @PostMapping("/comment")
    fun saveComment(
        @RequestBody
        comment: CommentsModel,
    ): ResponseEntity<Boolean> =  ResponseEntity.ok(commentsService.save(comment));

}