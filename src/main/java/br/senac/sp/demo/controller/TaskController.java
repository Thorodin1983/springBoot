package br.senac.sp.demo.controller;

import br.senac.sp.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired //Injeção de depedência
    TaskRepository repository;
    @GetMapping
    public String index(Model model){
        var lista = repository.findAll();
        model.addAttribute("tasks", lista);
        System.out.println(lista);
        return "task/index";
    }
}
