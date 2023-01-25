package in.nareshit.raghu.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nareshit.raghu.entity.Specilization;
@Repository
public interface SpecializationRepository extends JpaRepository<Specilization, Long> {

}