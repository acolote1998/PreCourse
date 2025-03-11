package com.example.second_rest_api.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class MutableLiveStreamTest {

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


}