package com.example.second_rest_api.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InmutableLiveStreamTest {

    @Test
    void create_new_inmutable_live_stream(){
        InmutableLiveStream stream = new InmutableLiveStream(
                UUID.randomUUID().toString(),"Building REST APIs with Spring Boot", """
                				Spring Boot is very convenient to use when building REST APIs; it allows you to
                				do a lot of things. This text could continue
                ""","https://www.twitc.tv/danvega",
                LocalDateTime.of(2022,2,16,11,30),
                LocalDateTime.of(2022,2,16,13,30)
        );
        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot",stream.getTitle());
    }

}


