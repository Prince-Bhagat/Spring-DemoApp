package com.prince.java.project.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {
    @Query("select  u from  User u where u.id = :id")
    User getUserById(@Param("id") Integer id);
}