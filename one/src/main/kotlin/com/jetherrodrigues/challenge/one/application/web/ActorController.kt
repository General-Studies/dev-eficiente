package com.jetherrodrigues.challenge.one.application.web

import com.jetherrodrigues.challenge.one.application.web.request.ActorRequest
import com.jetherrodrigues.challenge.one.application.web.response.ActorResponse
import com.jetherrodrigues.challenge.one.domain.Actor
import com.jetherrodrigues.challenge.one.service.ActorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/v1/actors")
class ActorController(private val service: ActorService) {

    fun createActor(@RequestBody @Valid request: ActorRequest): ResponseEntity<ActorResponse> =
            request.let(ActorRequest::toActor)
                    .run {
                        service.save(this)
                    }.let {
                        ResponseEntity.ok().body(ActorResponse.from(it))
                    }

}