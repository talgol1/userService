package com.userService.controller;

import com.userService.model.ShowResponse;
import com.userService.service.AnswerService;
import com.userService.tvMaze.TvMazeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @DeleteMapping(value = "/answer/{userId}/deleteAll")
    void deleteAllAnswersByUserId(@PathVariable Long userId){
        System.out.println("im in the controller");
        answerService.deleteAllAnswersByUserId(userId);
    }
}
