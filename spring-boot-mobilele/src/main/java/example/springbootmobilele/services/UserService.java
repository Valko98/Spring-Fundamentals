package example.springbootmobilele.services;

import example.springbootmobilele.model.dtos.UserLoginDTO;
import example.springbootmobilele.model.entities.User;
import example.springbootmobilele.model.repositories.UserRepository;
import example.springbootmobilele.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserService(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;

    }

    public boolean login(UserLoginDTO loginDTO) {
       Optional <User> userOpt =
               userRepository.findByEmail(loginDTO.getUsername());

       if(userOpt.isEmpty()) {
           LOGGER.info("User with name [{}] not found.", loginDTO.getUsername());
           return false;
       }

        boolean success = userOpt.get().getPassword().equals(loginDTO.getPassword());
        if(success) {
            login(userOpt.get());
        } else {
            logout();
        }
        return success;
    }

    private void login(User user) {
        currentUser.
                setLoggedIn(true).
                setName(user.getFirstName() + " " + user.getLastName());

    }

    public void logout() {
        currentUser.clear();
    }
}
