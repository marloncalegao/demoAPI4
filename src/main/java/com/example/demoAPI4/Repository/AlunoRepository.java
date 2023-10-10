package com.example.demoAPI4.Repository;

import com.example.demoAPI4.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
