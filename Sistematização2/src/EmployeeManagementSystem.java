import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private List<Employee> employees;
    private Scanner scanner;

    // Construtor
    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para adicionar um novo empregado
    public void addEmployee() {
        System.out.println("Digite o nome do empregado:");
        String name = scanner.nextLine();

        System.out.println("Digite a idade do empregado:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o cargo do empregado:");
        String position = scanner.nextLine();

        System.out.println("Digite o salário do empregado:");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        Employee emp = new Employee(name, age, position, salary);
        employees.add(emp);

        System.out.println("Empregado adicionado com sucesso!");
    }

    // Método para exibir todos os empregados
    public void displayEmployees() {
        System.out.println("\nLista de Empregados:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    // Método principal para executar o sistema
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Sistema de Gerenciamento de Empregados");
            System.out.println("1. Adicionar Empregado");
            System.out.println("2. Exibir Empregados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    system.addEmployee();
                    break;
                case 2:
                    system.displayEmployees();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
