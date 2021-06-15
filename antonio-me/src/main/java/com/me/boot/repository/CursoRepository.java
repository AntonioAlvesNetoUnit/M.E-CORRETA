package com.me.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.boot.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
