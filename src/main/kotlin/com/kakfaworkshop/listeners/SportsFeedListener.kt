package com.kakfaworkshop.listeners

import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener
class SportsFeedListener {
    @Topic("sports")
    fun receive(msg: String) {
        println("Consumed sports event off Kafka: $msg")
    }

    @Topic("teams")
    fun receiveTeams(msg: String) {
        println("Consumed event off Kafka: $msg")
    }
}
