package service;

import model.User;
import repository.UserDB;

public class UserService {

    UserDB userDB;

    public UserService() {
        this.userDB = new UserDB();
    }

    public User validateUserId(int id) {
        return userDB.getUserById(id);
    }

    public User createNewUser(String name) {
        return userDB.createNewUser(name);
    }
}