package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zooclub zooclub = new Zooclub();
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        while (!isExit) {
            System.out.println("Введіть:");
            System.out.println("1 щоб додати учасника клубу");
            System.out.println("2 щоб Додати тваринку до учасника клубу");
            System.out.println("3 щоб Видалити тваринку з учасника клубу");
            System.out.println("4 щоб Видалити учасника з клубу");
            System.out.println("5 щоб Видалити конкретну тваринку зі всіх власників");
            System.out.println("6 щоб Вивести на екран зооклуб");
            System.out.println("7 щоб Вийти з програми");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                zooclub.addMember();
                    break;
                case 2:
                    zooclub.addAnimal();
                    break;
                case 3:
                    zooclub.removeAnimal();
                    break;
                case 4:
                    zooclub.removeMember();
                    break;
                case 5:
                    zooclub.removeAnimalFromAll();
                    break;
                case 6:
                    zooclub.printZooclub();
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("Некоректний ввід, спробуйте ще раз");
                    break;
            }
        }


    }


}
