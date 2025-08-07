package day3.task;

public class User {
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public void displayUser() {
        System.out.println("User: " + name + ", ID: " + userId);
    }
}

