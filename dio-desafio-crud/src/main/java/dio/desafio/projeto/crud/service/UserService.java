package dio.desafio.projeto.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.projeto.crud.entity.User;
import dio.desafio.projeto.crud.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User FindById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    public List<User> findAll() {
        return userRepository.findAll();        
    }

    public User updateUser(User newUser, int id) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setUsername(newUser.getUsername());
        
        return userRepository.save(existingUser);
    }

    public void deleteUser(int id){
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        
        userRepository.delete(existingUser);
    }
}
