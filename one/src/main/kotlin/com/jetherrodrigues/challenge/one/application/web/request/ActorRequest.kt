package com.jetherrodrigues.challenge.one.application.web.request

import com.jetherrodrigues.challenge.one.domain.Actor
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class ActorRequest(
        @field:NotNull
        val name: String,
        @field:NotNull
        @field:Email
        val email: String,
        @field:NotNull
        @field:Size(max = 400)
        val description: String
) {
        fun toActor() = Actor(
                name = name,
                email = email,
                description = description
        )
}