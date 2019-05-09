package sawyern.snresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sawyern.snresume.models.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
