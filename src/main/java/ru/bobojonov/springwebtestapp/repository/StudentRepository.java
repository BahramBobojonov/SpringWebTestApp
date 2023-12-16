package ru.bobojonov.springwebtestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bobojonov.springwebtestapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}