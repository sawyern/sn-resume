package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
}
