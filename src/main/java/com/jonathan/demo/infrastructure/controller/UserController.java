package com.jonathan.demo.infrastructure.controller;

import com.jonathan.demo.application.dto.user.RequestUserDto;
import com.jonathan.demo.application.dto.user.ResponseUserDto;
import com.jonathan.demo.application.service.UserApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserApplicationService userService;

    public UserController(UserApplicationService userService) {
        this.userService = userService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/new_user")
    public ResponseEntity<ResponseUserDto> create(@RequestBody RequestUserDto requestUserDto) {
        return ResponseEntity.ok(userService.create(requestUserDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseUserDto> getById(@PathVariable("id") long id){
        ResponseUserDto user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
}
