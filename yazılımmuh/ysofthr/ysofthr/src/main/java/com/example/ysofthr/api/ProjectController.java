package com.example.ysofthr.api;

import com.example.ysofthr.business.abstracts.ProjectService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.Project;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/getById")
    public DataResult<Project> getById(@RequestParam int id){
        return this.projectService.getById(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<Project>> getAll(){



        return this.projectService.getAll();
    }

    @PostMapping("/add")
    public DataResult<Project> add(@RequestBody Project project){

        return this.projectService.add(project);
    }




}
