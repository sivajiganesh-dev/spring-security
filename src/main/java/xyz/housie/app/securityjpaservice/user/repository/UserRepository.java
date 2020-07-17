package xyz.housie.app.securityjpaservice.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import xyz.housie.app.securityjpaservice.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findUserByUsername(String username);
}
