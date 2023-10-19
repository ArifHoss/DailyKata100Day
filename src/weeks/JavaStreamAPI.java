package weeks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamAPI {
    public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A"); // adding elements
        arrayList.add("B");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("C");
        linkedList.add("D");
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("E");
        hashSet.add("E"); // duplicate, won't be added
        hashSet.add("F");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("G");
        linkedHashSet.add("H");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("I");
        treeSet.add("J");
        System.out.println("TreeSet: " + treeSet);

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("K", 1);
        hashMap.put("L", 2);
        System.out.println("HashMap: " + hashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("M", 3);
        treeMap.put("N", 4);
        System.out.println("TreeMap: " + treeMap);


        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);

        // Set example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple"); // duplicate element, won't be added
        System.out.println("Set: " + set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        System.out.println("Map: " + map);

        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.offer("Message1");
        queue.offer("Message2");
        System.out.println("Queue: " + queue);

        // Deque as Stack (LIFO)
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Task1");
        stack.push("Task2");
        System.out.println("Stack: " + stack);


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        int evenNumbers = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .map(n -> n * 2)
//                .reduce(0, Integer::sum);

//        System.out.println(evenNumbers);

//        List<String> strings = Arrays.asList("Newcastle", "United", "Confirmed", "Midfielder");
//        List<String> list = strings.stream()
//                .filter(x -> x.length() > 5)
//                .peek(e -> System.out.println("Filtered Value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped Value: " + e))
//                .toList();

//        List<String> names = Arrays.asList("Sumon","Reza","Palash","Kabir");
   /*     List<String> upperCaseName = new ArrayList<>();
        for (String name : names) {
            upperCaseName.add(name.toUpperCase());
        }*/

//        List<String> upperCaseName = names.stream().map(String::toUpperCase).toList();
//        upperCaseName.forEach(name -> System.out.println("Names: "+ name));
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer reduced = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .reduce(0, Integer::sum);
//        System.out.println("Reduced: "+reduced);


//        List<Integer> evenNumber = numbers.stream()
//                .filter(number -> isEven(number))
//                .map(number -> doubleTheValue(number))
//                .collect(Collectors.toList());
//        System.out.println(evenNumber);
    }

//    private static int doubleTheValue(Integer number) {
//        return number * 2;
//    }
//
//    private static boolean isEven(Integer number) {
//        return number % 2 == 0;
//    }
}
