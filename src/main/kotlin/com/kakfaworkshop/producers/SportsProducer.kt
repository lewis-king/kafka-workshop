package com.kakfaworkshop.producers

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface SportsProducer {
    fun produceSports(@Topic topic: String, @KafkaKey key: String, message: String)
}
