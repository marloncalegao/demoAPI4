package com.example.demoAPI4.Controller;

import com.example.demoAPI4.Model.Aluno;
import com.example.demoAPI4.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiAluno")
public class AlunoControl {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping ("/todos")
    public List<Aluno> buscarTodosAlunos(){
        return alRepo.findAll();
    }

}
