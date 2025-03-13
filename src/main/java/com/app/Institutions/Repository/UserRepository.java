package com.app.Institutions.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Institutions.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

}
