package com.jgvg.test_bcnc_group

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate


@SpringBootApplication
class TestBcncGroupApplication

@Bean
fun restTemplate(builder: RestTemplateBuilder): RestTemplate {
	return builder.build()
}

fun main(args: Array<String>) {
	SpringApplication.run(com.jgvg.test_bcnc_group.TestBcncGroupApplication::class.java, *args)
}


