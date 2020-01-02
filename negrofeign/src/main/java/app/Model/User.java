package app.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ApiModel(description = "User details")
public class User {

    @ApiModelProperty(value = "Unique user ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @ApiModelProperty(value = "User name")
    private String userName;
    @ApiModelProperty(value = "User password")
    private String password;
    @ApiModelProperty(value = "Describes if a user is enabled or not")
    private boolean enabled=true;
    @ApiModelProperty(value = "User Authority details")
    private String auth = "USER";

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
