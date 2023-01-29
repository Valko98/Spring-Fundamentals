package example.springbootmobilele.user;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {

    //This is a dummy security class.

    private String name;

    private boolean loggedIn;


    public String getName() {
        return name;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public boolean isAnonymous() {
        return !isLoggedIn();
    }
    public CurrentUser setName(String name) {
        this.name = name;
        return this;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }
    public void clear() {
        loggedIn = false;
        name = null;
    }
}
