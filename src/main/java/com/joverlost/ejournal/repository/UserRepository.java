package com.joverlost.ejournal.repository;

import com.joverlost.ejournal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String username);
    Boolean existsByEmail(String email);

}