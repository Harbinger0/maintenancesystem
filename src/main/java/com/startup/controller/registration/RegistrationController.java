package com.startup.controller.registration;
import com.startup.entity.user.User;
import com.startup.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping("/registeruser")
    @CrossOrigin(origins = "http://localhost:4200")
    public User registerUser(@RequestBody User user) throws Exception {
        String tempEmailId = user.getEmailId();
        if(tempEmailId != null && !"".equals(tempEmailId)){
            User userobj =   service.fetchUserByEmailId(tempEmailId);
            if(userobj != null){
                throw new Exception("user with this id "+ tempEmailId +" already exist");
            }
        }
        User userObject = null;
       userObject = service.create(user);
       return userObject;
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User LoginUser(@RequestBody User user) throws Exception {
        String tempEmailId = user.getEmailId();
        String tempPass = user.getPassword();
        User userObj = null;
        if(tempEmailId != null && tempPass != null){
           userObj = service.fetchUserByEmailAndPassword(tempEmailId, tempPass);
        }
        if(userObj == null){
            throw new Exception("Bad credentials");
        }

        return userObj;
    }
}
