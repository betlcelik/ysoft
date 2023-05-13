package com.example.ysofthr.business.concretes;

import com.example.ysofthr.business.abstracts.ProjectService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.core.results.SuccessDataResult;
import com.example.ysofthr.dataAccess.abstracts.ProjectDao;
import com.example.ysofthr.entities.Position;
import com.example.ysofthr.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManager implements ProjectService {

    private ProjectDao projectDao;

    public ProjectManager(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public DataResult<Project> getById(int id) {
        return new SuccessDataResult<Project>(this.projectDao.findById(id));
    }

    @Override
    public DataResult<List<Project>> getAll() {
        return new SuccessDataResult<List<Project>>(this.projectDao.findAll());
    }

    @Override
    public DataResult<Project> add(Project project) {
        this.projectDao.save(project);

        return new SuccessDataResult<Project>(project,"Project added successfully");
    }
}
