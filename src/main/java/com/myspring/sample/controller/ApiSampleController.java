package com.myspring.sample.controller;

import com.myspring.sample.dto.ApiSampleDto;
import com.myspring.sample.service.ApiSampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class ApiSampleController {
    private final ApiSampleService apiSampleService;
    // 회원 전체 조회
    @GetMapping("/string")
    public ResponseEntity<String> responseString() {
        String text = apiSampleService.getString();
        return ResponseEntity.ok(text);
    }
    @PostMapping("/input")
    public ResponseEntity<Boolean> inputSample(@RequestBody ApiSampleDto apiSampleDto) {
        return ResponseEntity.ok(apiSampleService.inputSample(apiSampleDto));
    }

    @GetMapping("/output")
    public ResponseEntity<List<ApiSampleDto>> outputSample() {
        return ResponseEntity.ok(apiSampleService.outputSample());
    }
}
