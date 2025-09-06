package Task2;

import java.util.Objects;

public class Customer {

    private String name;
    private int age;
    private int purchase;

    public Customer(String name, int age, int purchase) {
        this.name = name;
        this.age = age;
        this.purchase = purchase;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPurchase() {
        return purchase;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && purchase == customer.purchase && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, purchase);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", purchase=" + purchase +
                '}';
    }
}
