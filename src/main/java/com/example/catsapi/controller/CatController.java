package com.example.catsapi.controller;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @PostMapping
    public Cat save(@RequestBody CatDto cat){
//        @RequestBody - аннотация говорит, что это тело запроса, а не параметр
        return service.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return service.getAll();
    }

}
