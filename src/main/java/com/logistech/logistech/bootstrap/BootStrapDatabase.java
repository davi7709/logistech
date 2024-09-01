package com.logistech.logistech.bootstrap;

import com.logistech.logistech.model.User;
import com.logistech.logistech.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDatabase implements CommandLineRunner{
    private final UserRepository userRepository;

    public BootStrapDatabase(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) {
        try {
            User user = new User("Davi", "43721789806", "davi@gmail", "098390120");
            User user2 = new User("jonas", "8920348532", "jonas@gmail", "98348759");
            userRepository.save(user);
            userRepository.save(user2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
