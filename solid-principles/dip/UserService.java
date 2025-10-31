package dip;

public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void registerUser(String user) {
        System.out.println("Mendaftarkan user: " + user);
        database.insert(user);
    }
}
