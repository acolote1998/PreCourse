package com.example.second_rest_api.controller;

import com.example.second_rest_api.model.LiveStream;
import com.example.second_rest_api.repository.LiveStreamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {


    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository){
        this.repository=repository;
    }

    // GET http://localhost.com/streams
    @GetMapping
    public List<LiveStream> findAll(){
     return repository.findAll();
    }

    // GET http://localhost.com/streams/123123-123-123-123(example)
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id){
        return repository.findById(id);
    }

    // POST http://localhost:8080/streams
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create (@RequestBody LiveStream stream){
        return repository.create(stream);
    }
}
