package com.jetherrodrigues.challenge.one.service

import com.jetherrodrigues.challenge.one.domain.Actor
import org.springframework.stereotype.Service

@Service
interface ActorService {

    fun save(actor: Actor): Actor

}