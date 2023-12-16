package ru.bobojonov.springwebtestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bobojonov.springwebtestapp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}