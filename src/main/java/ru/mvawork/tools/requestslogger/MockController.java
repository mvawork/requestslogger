package ru.mvawork.tools.requestslogger;

import org.springframework.web.bind.annotation.*;

@RestController
public class MockController {

    @PostMapping(path = "/**")
    public String doPost(){
        return "";
    }

    @GetMapping(path = "/**")
    public String doGet() {
        return "ok";
    }

    @DeleteMapping(path = "/**")
    public String doDelete() {
        return "";
    }

    @PutMapping(path = "/**")
    public String doPut() {
        return "";
    }

    @PatchMapping(path = "/**")
    public String doPatch() {
        return "";
    }

}
