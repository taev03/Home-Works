package User;

public class Login {
    String login;

    public Login (String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString () {
        return "Login: " + login + "\n";
    }
}
