package com.example.anketa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "anketa")
public class Anketa {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "anketa_name")
    String name;
    @Column(name = "anketa_surname")
    String surname;
//  @Column(name = "anketa_phone", unique = true)
    @Column(name = "anketa_phone")
    String phone;

    public Anketa(String name, String surname, String phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
}
