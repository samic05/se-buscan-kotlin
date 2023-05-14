package co.com.sebuscan.missing.people.controller

import co.com.sebuscan.missing.people.persistance.MissingPeopleRepository
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleEntity
import co.com.sebuscan.missing.people.persistance.entity.MissingPeopleModel
import co.com.sebuscan.missing.people.service.LookAndSaveService
import co.com.sebuscan.missing.people.service.LookSaveAndRandom
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import java.io.BufferedReader
import java.io.FileReader

@RestController
@RequestMapping("/missing")
class MissingPeopleController(
    private val missingPeopleService: LookSaveAndRandom<MissingPeopleModel>,
) {
    @CrossOrigin
    @GetMapping("/person/{personId}")
    fun getById(
        @PathVariable(name = "personId", required = true)
        personId:String
    ): ResponseEntity<MissingPeopleModel> =  ResponseEntity.ok(missingPeopleService.lookById(personId.toInt()));
    @CrossOrigin
    @GetMapping("/random/{count}")
    fun getRandom(
        @PathVariable(name = "count", required = true)
        count:String
    ): ResponseEntity<List<MissingPeopleModel>> =  ResponseEntity.ok( missingPeopleService.getRandomEntries(count.toInt()));
}