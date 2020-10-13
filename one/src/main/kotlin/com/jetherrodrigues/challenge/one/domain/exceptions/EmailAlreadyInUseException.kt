package com.jetherrodrigues.challenge.one.domain.exceptions

data class EmailAlreadyInUseException(override val message: String?) : RuntimeException(message)