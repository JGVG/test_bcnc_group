package com.jgvg.test_bcnc_group

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class TestBcncGroupApplication

@Bean
fun getresttemplate(): RestTemplate {
	return RestTemplate()
}

fun main(args: Array<String>) {
	SpringApplication.run(TestBcncGroupApplication::class.java, *args)
}


