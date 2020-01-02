package app.Controller;

import app.Model.CityFiveDaysForecast;
import app.Service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/newUser")
    @ApiOperation(value = "Registers a new user through query param",
            response = CityFiveDaysForecast.class)
    public String registerUser(@RequestParam(name = "username")String userName,@RequestParam(name = "password")String password){
        userService.registerUser(userName, password);
        return "user created";
    }


}
