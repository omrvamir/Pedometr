import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker st1 = new StepTracker();

        while (userInput != 4) {
            if (userInput == 1) {
                System.out.print("Введите номер месяца: ");
                int monthNumber = scanner.nextInt();

                if (monthNumber > 12 || monthNumber < 1) {
                    System.out.println("Вы ввели неверный номер месяца (1 - 12).");
                    break;
                }

                System.out.print("Введите номер дня: ");
                int dayNumber = scanner.nextInt();

                if (dayNumber > 30 || dayNumber < 1) {
                    System.out.println("Вы ввели неверный номер дня (1 - 30).");
                    break;
                }

                System.out.print("Введите количество пройденных шагов за данный день: ");
                int stepsInDay = scanner.nextInt();

                st1.addStepsInDay(monthNumber, dayNumber, stepsInDay); // ввести количество шагов за определённый день
            } else if (userInput == 2) {
                System.out.print("Введите номер месяца: ");
                int monthNumber = scanner.nextInt();

                if (monthNumber > 12 || monthNumber < 1) {
                    System.out.println("Вы ввели неверный номер месяца (1 - 12).");
                    break;
                }

                st1.statisticsForMonth(monthNumber); // напечатать статистику за определённый месяц
            } else if (userInput == 3) {
                System.out.print("Введите целевое количество шагов: ");
                int targetSteps = scanner.nextInt();

                st1.setTargetSteps(targetSteps); // изменить цель по количество шагов
            } else {
                System.out.println("Вы ввели неверное число.");
            }

            printMenu();
            userInput = scanner.nextInt();
        }

        System.out.println("Программа завершена.");
    }

    private static void printMenu() {
        System.out.println("1. Ввести количество шагов за определённый день;");
        System.out.println("2. Напечатать статистику за определённый месяц;");
        System.out.println("3. Изменить цель по количеству шагов в день;");
        System.out.println("4. Выйти из приложения.");
    }
}