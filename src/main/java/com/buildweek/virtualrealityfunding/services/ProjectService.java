package com.buildweek.virtualrealityfunding.services;

import com.buildweek.virtualrealityfunding.models.Project;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface ProjectService
{
    //search all projects
    List<Project> findAll(Pageable pageable);

    //save project
    void  save(Project project);

    //delete project
    void delete(long id);

    Project update(Project project, long id);

    Project findById(long id);
}

