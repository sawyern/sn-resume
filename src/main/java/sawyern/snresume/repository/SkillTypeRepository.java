package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.SkillType;

@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, String> {
}
