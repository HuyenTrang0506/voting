package net.codejava.controller;

import net.codejava.service.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elections")
public class ElectionController {
    @Autowired
    private ElectionService electionService;

}
