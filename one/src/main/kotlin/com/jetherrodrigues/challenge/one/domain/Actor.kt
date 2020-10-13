package com.jetherrodrigues.challenge.one.domain

import io.azam.ulidj.ULID
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collection = "actors")
data class Actor(
        @Id
        val id: String = ULID.random(),
        val name: String,
        @Indexed(unique = true)
        val email: String,
        val description: String,
        val created: Instant = Instant.now()
)