package users;

public abstract class User {
    public String name;
    public String surename;
    public String role;

    public User(String name, String surename, String role) {
        this.name = name;
        this.surename = surename;
        this.role = role;
    }
    public String toString() {
        return name + " " + surename + ", " + role;
    }
}

