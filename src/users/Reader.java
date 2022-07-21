package users;

public interface Reader {
    void readBook(User readerPerson);
    void finishBook(User readerPerson, User librarianPerson);

}
