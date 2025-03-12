package com.example.second_rest_api.controller;

import com.example.second_rest_api.model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    // GET http://localhost.com/streams
    @GetMapping
    public List<LiveStream> findAll(){
     return null;
    }
}
