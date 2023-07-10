package com.personal.audiobookms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audiobook")
public class AudiobookController {
    @RequestMapping("/test")
    public ResponseEntity<String>  testAudiobook(){
        return new ResponseEntity<String>("Audio book apis are working", HttpStatus.OK);
    }
}

