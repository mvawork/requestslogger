package ru.mvawork.tools.requestslogger;

import org.springframework.web.bind.annotation.*;

@RestController
public class MockController {

    @PostMapping("/*")
    public String doPost(){
        return "";
    }

    @GetMapping("/*")
    public String doGet() {
        return "";
    }

    @DeleteMapping("/*")
    public String doDelete() {
        return "";
    }

    @PutMapping("/*")
    public String doPut() {
        return "";
    }

    @PatchMapping("/*")
    public String doPatch() {
        return "";
    }

}
