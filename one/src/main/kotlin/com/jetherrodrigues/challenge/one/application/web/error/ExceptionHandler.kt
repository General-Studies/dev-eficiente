package com.jetherrodrigues.challenge.one.application.web.error

import com.fasterxml.jackson.annotation.JsonFormat
import com.jetherrodrigues.challenge.one.domain.exceptions.EmailAlreadyInUseException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.time.LocalDateTime

@RestControllerAdvice
class ExceptionHandler  {

    companion object {
        private const val BAD_REQUEST_ERROR = "BAD_REQUEST_ERROR";
    }

    @ExceptionHandler(EmailAlreadyInUseException::class)
    fun handleBadRequestException(e: EmailAlreadyInUseException) =
        ResponseEntity(ErrorResponse(
                code = BAD_REQUEST_ERROR,
                message = e.message,
                status = HttpStatus.BAD_REQUEST.value()
        ), HttpStatus.BAD_REQUEST)

}

data class ErrorResponse(
        val code: String,
        val message: String?,
        val status: Int,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
        private val timestamp: LocalDateTime = LocalDateTime.now()
)