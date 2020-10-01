package com.jetherrodrigues.challenge.one.application.web.request

import org.springframework.lang.NonNull

data class ActorRequest(
        @NonNull
        val name: String,
        @NonNull
        val email: String,
        @NonNull
        val description: String
)