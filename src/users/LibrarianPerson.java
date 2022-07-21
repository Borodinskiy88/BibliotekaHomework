package users;

public class LibrarianPerson extends User implements Librarian {
    public LibrarianPerson(String name, String surename, String role) {
        super(name, surename, role);
    }

    @Override
    public void orderBook(User librarianPerson, User supplierPerson) {
        System.out.println(supplierPerson + ", привез книгу, которую заказал " + librarianPerson);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
