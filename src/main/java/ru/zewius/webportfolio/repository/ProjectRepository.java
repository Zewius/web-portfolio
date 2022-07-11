package ru.zewius.webportfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zewius.webportfolio.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
