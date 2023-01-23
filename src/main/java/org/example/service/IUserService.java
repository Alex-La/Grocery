package org.example.service;

import org.example.model.User;

public interface IUserService {
    User findById(Long id);

    User findByName(String name);
}
