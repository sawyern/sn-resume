package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.Industry;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, String> {
}
