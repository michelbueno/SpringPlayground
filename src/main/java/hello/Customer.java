package hello;

public class Customer {

    private long id;
    private String firstName, lastName;

    public Customer(long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s'",
                id, firstName, lastName);
    }


}
