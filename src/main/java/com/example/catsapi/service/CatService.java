package com.example.catsapi.service;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;


//    Тоже самое, что @RequiredArgsConstructor
//    public CatService(CatRepository catRepository){
//        this.catRepository = catRepository;
//    }

    public Cat save(CatDto catDto){

    }


//    Правильнее воспользоваться фильтром и pageable, так как выгрузка
//    из БД может занять большое время

    public Iterable<Cat> getAll() {

    }
}
