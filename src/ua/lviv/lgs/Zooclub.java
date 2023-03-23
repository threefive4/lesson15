package ua.lviv.lgs;

import java.util.*;

public class Zooclub {
    Map<Person, List<Animal>> map = new HashMap<>();
    public void addMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть учасника клубу: ");
        String personName = scanner.nextLine();
        System.out.println("Введiть вiк: ");
        int personAge = scanner.nextInt();
        Person person1 = new Person(personName, personAge);
        map.put(person1, new ArrayList<>());
        System.out.println("Учасника додано до клубу: " + person1);
    }
    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть тваринку: ");
        String animalType = scanner.nextLine();
        System.out.println("Введiть імя тваринки: ");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalType, animalName);
        System.out.println("Введiть учасника клубу: ");
        String personName = scanner.nextLine();
        System.out.println("Введiть вiк: ");
        int personAge = scanner.nextInt();
        Person person = new Person(personName, personAge);
        if (map.containsKey(person)) {
            map.get(person).add(animal);
            System.out.println("Тваринку додано до учасника клубу");
        } else {
            System.out.println("Учасника з таким іменем не знайдено");
        }
    }
    public void removeAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть тваринку: ");
        String animalType = scanner.nextLine();
        System.out.println("Введiть імя тваринки: ");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalType, animalName);
        System.out.println("Введiть учасника клубу: ");
        String personName = scanner.nextLine();
        System.out.println("Введiть вiк: ");
        int personAge = scanner.nextInt();
        Person person = new Person(personName, personAge);
        if (map.containsKey(person)){
            map.get(person).remove(animal);
            System.out.println("Тваринку видалено з учасника клубу");
        } else {
            System.out.println("Тваринку з таким іменем не знайдено");
        }
    }
    public void removeMember(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть учасника клубу: ");
        String personName = scanner.nextLine();
        System.out.println("Введiть вiк: ");
        int personAge = scanner.nextInt();
        Person person = new Person(personName, personAge);
        if (map.containsKey(person)){
            map.remove(person);
            System.out.println("Учасника видалено");
        }else {
            System.out.println("Учасника не знайдено");
        }
    }

    public void removeAnimalFromAll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть тваринку: ");
        String animalType = scanner.nextLine();
        System.out.println("Введiть імя тваринки: ");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalType, animalName);
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()){
               entry.getValue().remove(animal);
               System.out.println("З клубу видалено тваринку");

           }
    }

    public void printZooclub(){
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            entry.getKey();
            entry.getValue();
            System.out.println("Зооклуб ");
        }
    }





}
