public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    // Construtor
    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Métodos para obter informações (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Método para exibir informações do empregado
    public String toString() {
        return "Nome: " + name + ", Idade: " + age + ", Cargo: " + position + ", Salário: " + salary;
    }
}