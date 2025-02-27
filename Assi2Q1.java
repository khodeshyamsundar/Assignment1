import java.util.Scanner;
import java.util.HashMap;

class Main {
 
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter 1 for full-time and 2 for part-time: ");
        int num = scanner.nextInt(); 
        scanner.nextLine(); // ✅ 

        if (num == 1) {
            System.out.println("Enter your ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter a name: ");
            String name = scanner.nextLine(); 


            if (map.containsKey(id)) {
                fulltimeEmp obj = new fulltimeEmp(id);
                obj.calculateSalary();
            } else {
                System.out.println("User not found.");
                System.out.println("Enter 3 to register: ");
                int r = scanner.nextInt();
                scanner.nextLine();

                if (r == 3) {
                    map.put(id, name);
                    System.out.println("User registered successfully!");
                }
            }
        } else if (num == 2) {
            System.out.println("Enter your ID: ");
            int id = scanner.nextInt();

            parttimeEmp obj1 = new parttimeEmp(id);
            obj1.calculateSalary();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close(); 
    }
}

abstract class Employee {
    int id;

    Employee(int a) { 
        id = a;
    }

    abstract void calculateSalary();
}

class fulltimeEmp extends Employee {
    int salary = 50000; 

    fulltimeEmp(int id) {
        super(id); 
    }

    public void calculateSalary() {
        System.out.println("Your salary is " + salary);
    }
}

class parttimeEmp extends Employee {
    int salary = 25000; 

    parttimeEmp(int id) {
        super(id); 
    }

    public void calculateSalary() {
        System.out.println("Your salary is " + salary);
    }
}
