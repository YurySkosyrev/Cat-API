package com.example.catsapi.service;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;


//    Тоже самое, что @RequiredArgsConstructor
//    public CatService(CatRepository catRepository){
//        this.catRepository = catRepository;
//    }

    public Cat save(CatDto catDto){
       Cat cat = new Cat()
               .setName(catDto.getName())
               .setBirthDay(catDto.getBirthDay())
               .setId(UUID.randomUUID().toString())
               .setCreatedAt(LocalDateTime.now());

//       В postgres лучше подключить плагин для формирования UUID в базе данных,
//       тогда UUID в БД будет представлен в байтовом виде
//       и поиск по нему будет значительно быстрее

        return catRepository.save(cat);

    }


//    Правильнее воспользоваться фильтром и pageable, так как выгрузка
//    из БД может занять большое время

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
//    так делать не надо))
    }
}
