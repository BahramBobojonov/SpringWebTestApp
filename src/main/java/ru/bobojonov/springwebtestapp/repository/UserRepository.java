package ru.bobojonov.springwebtestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bobojonov.springwebtestapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}