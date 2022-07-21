package users;

public class SupplierPerson extends User implements Supplier {
    public SupplierPerson(String name, String surename, String role) {
        super(name, surename, role);
    }

    @Override
    public void bringBook(User supplierPerson, User readerPerson) {
        System.out.println(supplierPerson + ", привез книги, которые ждал " + readerPerson);

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
