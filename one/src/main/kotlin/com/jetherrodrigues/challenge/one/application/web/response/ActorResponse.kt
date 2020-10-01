package com.jetherrodrigues.challenge.one.application.web.response

import com.jetherrodrigues.challenge.one.domain.Actor
import java.time.Instant

data class ActorResponse(
        val id: String,
        val name: String,
        val email: String,
        val description: String,
        val created: Instant
) {
    companion object {
        fun from(actor: Actor) = ActorResponse(
                id = actor.id,
                name = actor.name,
                email = actor.email,
                description = actor.description,
                created = actor.created
        )
    }
}