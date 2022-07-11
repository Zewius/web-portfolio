package ru.zewius.webportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.zewius.webportfolio.repository.ProjectRepository;

@Controller
@Description("Controller responsible for project list")
@RequestMapping({"", "/", "/index", "/home"})
public class ProjectListController {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectListController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping()
    public String showReposList(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "index";
    }
}
