package com.jetherrodrigues.challenge.one.service.impl

import com.jetherrodrigues.challenge.one.domain.Actor
import com.jetherrodrigues.challenge.one.domain.exceptions.EmailAlreadyInUseException
import com.jetherrodrigues.challenge.one.repository.ActorRepository
import com.jetherrodrigues.challenge.one.service.ActorService
import org.springframework.dao.DuplicateKeyException

class ActorServiceImpl(private val repository: ActorRepository) : ActorService {

    override fun save(actor: Actor): Actor = try {
        repository.save(actor)
    } catch (e: DuplicateKeyException) {
        throw EmailAlreadyInUseException(e.message)
    }

}