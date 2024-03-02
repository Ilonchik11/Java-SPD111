package step.learning;

import java.sql.SQLOutput;
import java.util.*;

public class Intro {
    public void demo() {
        System.out.println("Java intro");
        byte b = 10; // Цілі числа різної розмірності
        short s = 1000; // ! всі типи знакові, беззнакових - немає
        int i = 1000000; //
        long l = 10000000000L;
        float f = 0.1f;
        double d = 1.23E-4;
        char c = 'A';
        boolean bb = true;

        int[] arr = new int[10];
        int[][] arr2; // jagged - "рвані" масиви - з можливою різною кількістю у підмасивах

        List<String> list1 = new ArrayList<>(); // <> - diamond operator
        List<String> list2 = new LinkedList<>();
        list1.add("Hello"); // String Pooling - компілятор веде перелік створених рядків
        list2.add("Hello"); // і друга поява рядка посилається на першу
        if(list1.get(0) == list2.get(0)) { // [0] --> .get(0)
            System.out.println("Equals"); // тут об'єкти - Equals, оскільки через String Pooling
        }                                 // це дійсно референси на один об'єкт
        else {
            System.out.println("Not equals");
        }
        list1.add("World") ;
        list2.add("World !");
        Map<Integer, String> map = new HashMap<>(); // ~Dictionary, Integer ~ boxing(int)
        map.put(10, new String("Hello"));
        if(list1.get(0).equals(map.get(10))) { // == reference equal -- 2 посилання на 1 об'єкт
            System.out.println("Equals"); // для порівняння контенту слід вживати str1.equals(str2)
        }
        else {
            System.out.println("Not equals");
        }

        map.put(20, "World !!");

        for(String str: list1) { // ~foreach
            System.out.print(str + " ");
        }
        System.out.println();

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf( //f - format with placeholders (%[type])
                    "%d => %s, ",
                    entry.getKey(), // значення для підстановки
                    entry.getValue());
        }

        // введення даних
        Scanner kbScanner = new Scanner(System.in) ; // сканер вхідного потоку, запити на його читання
                                                     // зупиняють роботу та очікують введення у консолі
        System.out.println("\nEnter your name: "); // !! без надпису не зупиняємо програмуII
        String name = kbScanner.nextLine(); // one word (~Console.Read)
        System.out.println("Hello, " + name);
        while(kbScanner.hasNext()) {
            kbScanner.next();
        }
    }
}
/*
Після створення нового проєкту необхідно налаштувати конфігурацію
запуску (за замовчанням запускається поточний файл).

Типи даних - всі референсні, за винятком примітивів
 */