package web.sandbox.service;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.sandbox.data.repository.UserRepository;
import web.sandbox.model.dto.UserDTO;
import web.sandbox.model.redis.User;
@Service
public class UserService {

    Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    public String createUser(@Valid UserDTO user){
        if(user == null) return null;
        else {
            User.Type type = user.getToken() == null ? User.Type.PUBLIC_USER : User.Type.DEV;
            User userToCreate = new User(user.getFirstName(), user.getLastName(), type);
            userRepository.save(userToCreate);
            LOGGER.info("[e2d56dc0] Saved user with id: {}", userToCreate.getID());
            return userToCreate.getFirstName();
        }
    }
}
