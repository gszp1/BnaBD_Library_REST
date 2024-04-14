package org.example.library_rest.service;

import org.example.library_rest.model.UserData;
import org.example.library_rest.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDataService {

    private final UserDataRepository userDataRepository;

    @Autowired
    public UserDataService(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    public List<UserData> getUserData() {
        return userDataRepository.findAll();
    }

    public Optional<UserData> getUserDataById(Long id) {
        return userDataRepository.findById(id);
    }

    public UserData saveUserData(UserData userData) {
        return userDataRepository.save(userData);
    }

    public UserData updateUserData(UserData userData) {
        return userDataRepository.save(userData);
    }

    public void deleteUserData(Long id) {
        userDataRepository.deleteById(id);
    }
}
