package xyz.housie.app.securityjpaservice.role.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import xyz.housie.app.securityjpaservice.role.model.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role,String> {
    Role findRoleByRole(String role);
}
