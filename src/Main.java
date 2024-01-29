import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру!");
        System.out.println("Давай посмотрим, как себя чувствует твой питомец:");
        DoPet pet = new DoPet(100, 100, 100, 100, 100);


        while (pet.isLife()) {
            pet.printlnCharacteristics();

            pet.printlnMenu();

            int action = pet.inputInt("Выберите действие: ", 0, 6);

            switch (action) {
                case 1: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение сытости");
                    int feed = scanner.nextInt();
                    pet.setDoeating(feed);
                    pet.squanderTime();
                }
                break;

                case 2: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение жажды");
                    int drunk = scanner.nextInt();
                    pet.setDodrinking(drunk);
                    pet.squanderTime();
                }
                break;

                case 3: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение бодрости");
                    int putToBed = scanner.nextInt();
                    pet.setDoSleeping(putToBed);
                    pet.squanderTime();
                }
                break;

                case 4: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение гигиены");
                    int hygienicProcedures = scanner.nextInt();
                    pet.setDoShower(hygienicProcedures);
                    pet.squanderTime();
                }
                break;

                case 5: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение здоровья");
                    int heal = scanner.nextInt();
                    pet.setDoHealing(heal);
                    pet.squanderTime();
                }
                break;

                case 6: {
                    pet.squanderTime();
                }
                break;

                case 0: {
                    System.exit(0);
                }
                break;
            }
        }
    }
}