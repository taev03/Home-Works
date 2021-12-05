package User;

public class Account {
    private final boolean account;

    public Account (boolean account) {
        this.account = account;
    }

    public boolean isAccount(boolean account) {
        return account;
    }

    @Override
    public String toString () {
        return "Is the account locked ? - " + account + "\n";
    }
}
