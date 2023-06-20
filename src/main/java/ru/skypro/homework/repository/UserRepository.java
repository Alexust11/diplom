package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.User;


import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    int countByEmail(String email);
    Optional<User> findByEmail(String userName);

    Integer getUserById(String name);

    String getUserByFirstName(Integer userId);

    String getAvatarUserById(Integer userId);
}
