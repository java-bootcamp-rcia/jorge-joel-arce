import app.Controller.UserController;
import app.Model.User;
import app.Service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class UserControllerTest {

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void saveUserTest(){
        User user = new User("user","password");
        userService.registerUser(user.getUserName(),user.getPassword());
        verify(userService).registerUser(user.getUserName(),user.getPassword());
    }

}
