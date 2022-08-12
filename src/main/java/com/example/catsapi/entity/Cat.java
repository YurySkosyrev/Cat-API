package com.example.catsapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
//Добавляет getter и setter на все поля
@Accessors(chain = true)
//Заменяет setter вида
//public Cat setName(String name){
//    return this
//}
//Чтобы использовать как цепочку при установке полей

public class Cat {

    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
