package Repository;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Franquia;

public interface FranquiaRepository extends JpaRepository<Franquia, VarcharTypeDescriptor>{

}
