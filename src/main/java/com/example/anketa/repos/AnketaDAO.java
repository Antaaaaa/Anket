package com.example.anketa.repos;

import com.example.anketa.model.Anketa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnketaDAO extends JpaRepository<Anketa, Long> { }
