package com.alessandro54.springtemplate.repository;

import com.alessandro54.springtemplate.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
