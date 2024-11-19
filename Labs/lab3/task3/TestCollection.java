package task3;

import java.awt.print.Printable;
import java.util.Arrays;

public class TestCollection {
    public static void main(String[] args) {
        ArrayCollection<Integer> collection = new ArrayCollection<>(5);
        ArrayCollection<Integer> otherCollection = new ArrayCollection<>(5);


        System.out.println("Добавление элементов:");
        System.out.println("Добавлено 10: " + collection.add(10)); // true
        System.out.println("Добавлено 20: " + collection.add(20)); // true
        System.out.println("Добавлено 30: " + collection.add(30)); // true
        System.out.println("Добавлено 40: " + collection.add(40)); // true
        System.out.println("Добавлено 50: " + collection.add(50)); // true
        try {
        	System.out.println("Добавлено 60 (переполнение): " + collection.add(60)); // false
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.err.println(e);
        }

        System.out.println("\nРазмер коллекции: " + collection.size()); // 5


        System.out.println("\nСодержит 30: " + collection.contains(30)); // true
        System.out.println("Содержит 60: " + collection.contains(60)); // false


        System.out.println("\nУдаление элемента 30: " + collection.remove(30)); // true
        System.out.println("Содержит 30 после удаления: " + collection.contains(30)); // false
        System.out.println("Размер коллекции после удаления: " + collection.size()); // 4


        otherCollection.add(10);
        otherCollection.add(20);
        System.out.println("\nУдаление всех элементов из другой коллекции (10, 20):");
        System.out.println("removeAll результат: " + collection.removeAll(otherCollection)); // true
        collection.printElements(); // Должны остаться только [40, 50]


        otherCollection.clear();
        otherCollection.add(40);
        otherCollection.add(50);
        System.out.println("\nСодержит все элементы другой коллекции (40, 50): " + collection.containsAll(otherCollection)); // true
        otherCollection.add(60);
        System.out.println("Содержит все элементы другой коллекции (40, 50, 60): " + collection.containsAll(otherCollection)); // false

        System.out.println("\nИтерация по коллекции:");
        collection.printElements();

        System.out.println("\nПечать коллекции через toString: " + collection);


        collection.clear();
        System.out.println("\nКоллекция очищена.");
        System.out.println("Размер коллекции после очистки: " + collection.size()); // 0
        System.out.println("Пустая коллекция: " + collection.isEmpty()); // true
        System.out.println("Печать очищенной коллекции через toString: " + collection);
    }
}
