package Task1;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String email;
    private int phoneNumber;

    public Person(String name, int age, String email, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null || email.isEmpty() || email.trim().isEmpty()) {
            throw new IllegalArgumentException(email == null ? "Email не может быть null" : email.isEmpty() ?
                    "Email не может быть пустым" : "Email не может состоять из одних пробелов");
        }
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && phoneNumber == person.phoneNumber && Objects.equals(name, person.name) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
