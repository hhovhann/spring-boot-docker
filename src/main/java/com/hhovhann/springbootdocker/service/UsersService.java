package com.hhovhann.springbootdocker.service;


import com.hhovhann.springbootdocker.domain.User;

public interface UsersService {
    User getUserByName(String name);

    User addUser(String name, String lastName, String email);

    void deleteUser(String name);
}
