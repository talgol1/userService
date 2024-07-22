package com.userService.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "AnswerService",
        url = "${externalApi.answerService.url}"
)

public interface AnswerService {
    @DeleteMapping(path="answer/{userId}/deleteAll")
    void deleteAllAnswersByUserId(@PathVariable Long userId);
}
