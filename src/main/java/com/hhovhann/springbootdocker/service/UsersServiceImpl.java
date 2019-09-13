package com.hhovhann.springbootdocker.service;

import com.hhovhann.springbootdocker.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.hhovhann.springbootdocker.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

    private final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);
    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public User getUserByName(String name) {
        return usersRepository.findByName(name);
    }

    @Override
    public User addUser(String name, String surname, String email) {
        return usersRepository.save(new User(name, surname, email));
    }

    @Override
    public void deleteUser(String name) {
        usersRepository.deleteByName(name);
    }
}