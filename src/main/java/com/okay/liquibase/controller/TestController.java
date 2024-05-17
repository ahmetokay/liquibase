package com.okay.liquibase.controller;

import com.okay.liquibase.entity.TestEntity;
import com.okay.liquibase.repository.TestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping(path = "/list")
    @ResponseBody
    public ResponseEntity<List<TestEntity>> list() {
        return new ResponseEntity<>(testRepository.findAll(), HttpStatus.OK);
    }
}