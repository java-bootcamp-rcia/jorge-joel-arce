package app.Service;

import app.Model.User;
import app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User>getUsers(){
        return userRepository.findAll();
    }

    public void registerUser(String userName, String password){
        User user = new User(userName,password);
        userRepository.save(user);
    }



}
