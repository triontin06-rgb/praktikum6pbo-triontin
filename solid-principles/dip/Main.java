package dip;

public class Main {
    public static void main(String[] args) {
        // Menggunakan MySQL
        Database mysql = new MySQL();
        UserService userService1 = new UserService(mysql);
        userService1.registerUser("Andi");

        System.out.println();

        // Menggunakan PostgreSQL
        Database postgre = new PostgreSQL();
        UserService userService2 = new UserService(postgre);
        userService2.registerUser("Budi");
    }
}
