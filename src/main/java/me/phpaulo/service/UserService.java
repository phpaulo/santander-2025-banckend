package me.phpaulo.service;

import me.phpaulo.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
