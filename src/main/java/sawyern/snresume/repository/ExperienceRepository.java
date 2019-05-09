package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, String> {
}
