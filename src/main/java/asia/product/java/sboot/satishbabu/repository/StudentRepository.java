package asia.product.java.sboot.satishbabu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asia.product.java.sboot.satishbabu.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
