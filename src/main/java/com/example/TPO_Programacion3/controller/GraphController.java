package com.example.TPO_Programacion3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TPO_Programacion3.service.GraphService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/graph")
public class GraphController {
    private final GraphService graphService;

    @Autowired
    public GraphController(GraphService graphService) {
        this.graphService = graphService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<String>> searchPath(@RequestParam String start, @RequestParam String end) {
        List<String> path = graphService.searchPath(start, end);
        if (path.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("No path found"));
        }
        return ResponseEntity.ok(path);
    }
}