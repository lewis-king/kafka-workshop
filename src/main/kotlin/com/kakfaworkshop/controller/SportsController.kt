package com.kakfaworkshop.controller

import com.kakfaworkshop.producers.SportsProducer
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.UUID

@Controller("/sports")
class SportsController(private val sportsProducer: SportsProducer) {

    @Post
    fun postSportsEvent(@Body body: String) {
        sportsProducer.produceSports("sports", UUID.randomUUID().toString(), body)
    }
}
