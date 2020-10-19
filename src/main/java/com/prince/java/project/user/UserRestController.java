package com.prince.java.project.user;

import com.prince.java.project.user.*;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserRestController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/user")
    public @ResponseBody User getUser(@RequestParam(value = "id") int id)
    {
        return userRepository.getUserById(id);
    }

    @CrossOrigin
    @PostMapping("/add")
    public @ResponseBody String addUser(
        @RequestParam(value = "name") String name,
        @RequestParam(value = "email") String email,
        @RequestParam(value = "phone_num") String phone_num,
        @RequestParam(value = "department") int department    
    )
    {
        User user = new User();
        user.setDepartment(department);
        user.setEmail(email);
        user.setName(name);
        user.setPhone_num(phone_num);
        userRepository.save(user);

        return "succes";
    }


}