package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<ru.skypro.homework.model.User> findFirstByUsername(String name);
}
