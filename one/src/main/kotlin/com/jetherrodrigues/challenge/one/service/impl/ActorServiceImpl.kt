package com.jetherrodrigues.challenge.one.service.impl

import com.jetherrodrigues.challenge.one.domain.Actor
import com.jetherrodrigues.challenge.one.repository.ActorRepository
import com.jetherrodrigues.challenge.one.service.ActorService

class ActorServiceImpl(private val repository: ActorRepository) : ActorService {

    override fun save(actor: Actor): Actor = repository.save(actor)

}