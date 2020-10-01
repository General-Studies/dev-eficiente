package com.jetherrodrigues.challenge.one.repository

import com.jetherrodrigues.challenge.one.domain.Actor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ActorRepository : MongoRepository<Actor, String>