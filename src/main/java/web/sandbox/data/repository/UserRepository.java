package web.sandbox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.sandbox.model.redis.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
