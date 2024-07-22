package com.userService.controller;

import com.userService.model.ShowResponse;
import com.userService.tvMaze.TvMazeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @Autowired
    TvMazeService tvMazeService;

    @GetMapping(value = "/shows/{showId}")
    ShowResponse getTvShowById(@PathVariable Long showId){
       return tvMazeService.getTvShowById(showId).toShowResponse();
    }
}
