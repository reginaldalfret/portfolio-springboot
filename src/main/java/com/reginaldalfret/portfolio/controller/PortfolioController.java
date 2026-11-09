package com.reginaldalfret.portfolio.controller;

import com.reginaldalfret.portfolio.service.PortfolioDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    private final PortfolioDataService dataService;

    public PortfolioController(PortfolioDataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping({"/", "/stacks/springboot", "/stacks/springboot/"})
    public String index(Model model) {
        model.addAttribute("contributions", dataService.getContributions());
        model.addAttribute("experiences", dataService.getExperiences());
        model.addAttribute("projects", dataService.getProjects());
        model.addAttribute("skills", dataService.getSkills());
        model.addAttribute("achievements", dataService.getAchievements());
        model.addAttribute("certifications", dataService.getCertifications());
        return "index";
    }
}
