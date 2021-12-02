package com.inotebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inotebook.models.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}
