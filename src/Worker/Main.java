package Worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Scanner scanner = new Scanner(System.in);

        // Введення даних працівників з клавіатури та перевірка формату року
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введіть дані для працівника №" + (i + 1));

            System.out.print("Прізвище та ініціали: ");
            String fullName = scanner.nextLine();

            System.out.print("Посада: ");
            String position = scanner.nextLine();

            int employmentYear;
            while (true) {
                try {
                    System.out.print("Рік надходження на роботу: ");
                    employmentYear = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некоректний формат року. Спробуйте ще раз.");
                }
            }

            workers[i] = new Worker(fullName, position, employmentYear);
        }

        // Сортування за абеткою
        Arrays.sort(workers, (w1, w2) -> w1.getFullName().compareToIgnoreCase(w2.getFullName()));

        System.out.print("Введіть значення стажу роботи: ");
        int requiredExperience = Integer.parseInt(scanner.nextLine());

        // Виведення прізвищ працівників зі стажем, що перевищує введене значення
        System.out.println("Прізвища працівників зі стажем більше " + requiredExperience + ":");
        for (Worker worker : workers) {
            if (2023 - worker.getEmploymentYear() > requiredExperience) {
                System.out.println(worker.getFullName());
            }
        }
    }
}

