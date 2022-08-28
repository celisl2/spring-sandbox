package web.sandbox.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.sandbox.model.dto.UserDTO;
import web.sandbox.model.redis.User;
import web.sandbox.service.UserService;
import web.sandbox.util.Constants;

@RestController
public class CacheController {

    Logger LOGGER = LoggerFactory.getLogger(CacheController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = Constants.CREATE, method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestHeader HttpHeaders headers, @RequestBody UserDTO user){

        ResponseEntity res = new ResponseEntity(HttpStatus.BAD_REQUEST);
        if(user != null){
            //TODO: add authentication
            userService.createUser(user);
            LOGGER.info("[190c5c06] Creating user record");
        }
        return res;
    }

}
