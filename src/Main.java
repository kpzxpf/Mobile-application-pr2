public class Main {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое: " + MathUtils.calculateAverage(10, 20));

        Employee emp = new Employee("Alice", 50000);
        emp.raiseSalary(10);
        System.out.println(emp.getName() + "'s new salary: " + emp.getSalary());

        Movie movie = new Movie("Inception", 2010);
        movie.displayInfo();

        Person person = new Person();
        person.setAge(25);
        System.out.println("Person's age: " + person.getAge());
        
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();
        guitar.play();
        piano.play();
    }
}