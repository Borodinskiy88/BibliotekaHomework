import users.*;

public class Main {
    public static void main(String[] args) {

        ReaderPerson readerPerson = new ReaderPerson("Иван", "Иванов", "читатель");
        LibrarianPerson librarianPerson = new LibrarianPerson("Петр", "Петров", "библиотекарь");
        SupplierPerson supplierPerson = new SupplierPerson("Михаил", "Михайлов", "поставщик");
        AdministratorPerson administratorPerson = new AdministratorPerson("Ольга", "Ольгина", "администратор");
        Security security = new Security("Василий", "Петрович", "охранник");

        readerPerson.readBook(readerPerson);
        readerPerson.finishBook(readerPerson, librarianPerson);
        librarianPerson.orderBook(librarianPerson, supplierPerson);
        administratorPerson.giveBook(administratorPerson, readerPerson, librarianPerson);
        supplierPerson.bringBook(supplierPerson, readerPerson);
        security.readBook(security);
        security.finishBook(security, librarianPerson);
        security.bringBook(security, readerPerson);
    }

}
//Переменные
//книга
//день недели
//имя

