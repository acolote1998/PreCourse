package com.example.second_rest_api;

import com.example.second_rest_api.model.MutableLiveStream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SecondRestApiApplicationTests {

	@Test
	void create_new_mutable_live_stream(){
		MutableLiveStream stream = new MutableLiveStream();
		stream.setId(UUID.randomUUID().toString());
		stream.setTitle("Building REST APIs with Spring Boot");
		stream.setDescription("""
				Spring Boot is very convenient to use when building REST APIs; it allows you to
				do a lot of things. This text could continue
				""");
		stream.setUrl("https://www.twitc.tv/danvega");
		stream.setStartDate(LocalDateTime.of(2022,2,16,11,30));
		stream.setStartDate(LocalDateTime.of(2022,2,16,13,30));
	assertNotNull(stream);
	assertEquals("Building REST APIs with Spring Boot",stream.getTitle());
	}

	/*
	@Test
	void contextLoads() {
	}

	 */

}
