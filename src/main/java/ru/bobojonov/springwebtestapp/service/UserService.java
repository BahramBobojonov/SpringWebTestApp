package ru.bobojonov.springwebtestapp.service;

import ru.bobojonov.springwebtestapp.dto.UserDto;
import ru.bobojonov.springwebtestapp.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}