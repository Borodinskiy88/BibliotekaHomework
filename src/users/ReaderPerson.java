package users;

public class ReaderPerson extends User implements Reader{

    public ReaderPerson(String name, String surename, String role) {
        super(name, surename, role);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void readBook(User readerPerson) {
        System.out.println(readerPerson + ", сейчас читает книгу '1984'");
    }
    @Override
    public void finishBook(User readerPerson, User librarianPerson) {
        System.out.println(readerPerson + ", дочитал книгу 'Война и мир', её забрал "  + librarianPerson);
    }
}
