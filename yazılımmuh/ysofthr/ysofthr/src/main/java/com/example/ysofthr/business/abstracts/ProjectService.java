package com.example.ysofthr.business.abstracts;

import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.Project;

import java.util.List;

public interface ProjectService {

    public DataResult<Project> getById(int id);
    public DataResult<List<Project>> getAll();
    public DataResult<Project> add(Project project);
}
