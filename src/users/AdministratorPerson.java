package users;

public class AdministratorPerson extends User implements Administrator {
    public AdministratorPerson(String name, String surename, String role) {
        super(name, surename, role);
    }

    @Override
    public void giveBook(User administratorPerson, User readerPerson, User librarianPerson) {
        System.out.println(administratorPerson + ", закрыла библиотеку в 8, хотя "
                + readerPerson + ", и " + librarianPerson + ", не хотели уходить");

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
