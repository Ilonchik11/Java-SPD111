package step.learning;

import java.util.*;

public class PhoneDirectory {
    private Map<String, String>  directory = new HashMap<>();
    public void PhoneApp() {
        initializeData();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Вітаємо Вас у телефонному довіднику!");

        do {
            Menu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    searchByPhoneNumber(scanner);
                    break;
                case 3:
                    searchByName(scanner);
                    break;
                case 4:
                    addEntry(scanner);
                    break;
                case 0:
                    System.out.println("Гарного дня!");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        } while(choice != 0);

        scanner.close();
    }
    private void Menu() {
        System.out.println("Меню:");
        System.out.println("1 - вивести все");
        System.out.println("2 - пошук за телефоном");
        System.out.println("3 - пошук за іменем");
        System.out.println("4 - додати запис");
        System.out.println("0 - вихід");

        System.out.println("Оберіть дію:");
    }
    private void initializeData() {
        directory.put("Ilona", "123456789");
        directory.put("Ілона", "987654321");
    }
    private void displayAll() {
        System.out.println("\nДані у телефонному довіднику:");
        for(Map.Entry<String, String> entry : directory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    private void searchByPhoneNumber(Scanner scanner) {
        System.out.println("\nВведіть номер телефону: ");
        String phoneNumber = scanner.nextLine();
        for(Map.Entry<String, String> entry : directory.entrySet()) {
            if(entry.getValue().equals(phoneNumber)) {
                System.out.println("Номер " + phoneNumber + " належить " + entry.getKey());
                return;
            }
        }
        System.out.println("Даного номеру телефону немає у довіднику.");
    }
    private void searchByName(Scanner scanner) {
        System.out.println("\nВведіть ім'я: ");
        String name = scanner.nextLine();
        if(directory.containsKey(name)) {
            System.out.println("Номер телефону " + name + " : " + directory.get(name));
        }
        else {
            System.out.println("Запис з іменем " + name + " не знайдено.");
        }
    }
    private void addEntry(Scanner scanner) {
        System.out.println("\nВведіть ім'я: ");
        String name = scanner.nextLine();
        System.out.println("\nВведіть номер телефону: ");
        String phoneNumber = scanner.nextLine();
        directory.put(name, phoneNumber);
        System.out.println("\nІнформацію додано успішно.");
    }
}
