package users;

public class Security extends User implements Reader, Supplier{

    public Security(String name, String surename, String role) {
        super(name, surename, role);
    }

    @Override
    public void readBook(User security) {
        System.out.println(security + ", по ночам читает книги в библиотеке");
    }

    @Override
    public void finishBook(User security, User librarianPerson) {
        System.out.println(security + ", прочитал уже абсолютно все книги. Он самый умный человек в библиотеке");

    }

    @Override
    public void bringBook(User security, User readerPerson) {
        System.out.println("Иногда " + security + ", приносит редкие книги из дома, и " + readerPerson
                + ", берет их почитать");

    }
}
