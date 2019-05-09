package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, String> {
}
