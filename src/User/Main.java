package User;

public class Main {
    public static void main(String[] args) {
        Full_name full_name = new Full_name("Taev", "Chyngyz", "Kalybekovich");
        System.out.println(full_name);


        Login login = new Login( "taev14112003@gmail.com");
        System.out.println(login);


        Age age = new Age(18);
        System.out.println(age);


        Password password = new Password("Asd123Asd123");
        System.out.println(password);


        Account account = new Account(false);
        System.out.println(account);
    }
}
