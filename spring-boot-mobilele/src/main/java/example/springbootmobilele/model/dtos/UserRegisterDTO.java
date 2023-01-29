package example.springbootmobilele.model.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterDTO {

    private String firstName;

    private String lastName;

    private String password;

    private String confirmPassword;
}
