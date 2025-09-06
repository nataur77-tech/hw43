package Task1;

/*
Доработать домашнее задание из урока 22 таким образом,
чтобы при попытке передачи в сеттер пустого е-мейла выбрасывалось
встроенное исключение IllegalArgumentException с информативным
поясняющим сообщением внутри.
 */


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Nat", 100, "nat100@gmail.com", 333555777);

        System.out.println("Имя: " +person.getName());

        System.out.println("Возраст: " + person.getAge());

        System.out.println("Email: " + person.getEmail());

        person.setEmail("07nat@gmail.com");
        System.out.println("Изменённый Email: " + person.getEmail());

        try {
            person.setEmail("");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            person.setEmail(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            person.setEmail("  ");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }
}
