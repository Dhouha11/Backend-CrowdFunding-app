package com.devops.crowdapp.dao;

import com.devops.crowdapp.entity.ProjectCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projectCategory", path ="projectCategory")
public interface ProjectCategoryRepository extends JpaRepository<ProjectCategory, Long> {
}
