package com.example.ysofthr.dataAccess.abstracts;

import com.example.ysofthr.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDao extends JpaRepository<Project, Integer> {

    public Project findById(int id);
}
