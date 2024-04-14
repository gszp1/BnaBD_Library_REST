package org.example.library_rest.controllers;

import org.example.library_rest.model.UserData;
import org.example.library_rest.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/userdata")
public class UserDataController {

    private final UserDataService userDataService;

    @Autowired
    public UserDataController(UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    @GetMapping("/all")
    public List<UserData> getUserData() {
        return userDataService.getUserData();
    }

    @GetMapping("/{id}")
    public UserData getUserDataById(@PathVariable("id") Long id) {
        Optional<UserData> userData = userDataService.getUserDataById(id);
        return userData.orElse(null);
    }

    @PostMapping("/add")
    public UserData saveUserData(@RequestBody UserData userData) {
        return userDataService.saveUserData(userData);
    }

    @DeleteMapping("/delete")
    public void deleteUserData(@RequestParam("id") Long id) {
        userDataService.deleteUserData(id);
    }

    @PutMapping("/update")
    public UserData updateUserData(@RequestBody UserData userData) {
        return userDataService.updateUserData(userData);
    }
}
