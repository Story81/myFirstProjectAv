package lesson_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> listB = new ArrayList<>(List.of(4, 5, 6, 7));

        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        Collection<Integer> union = collectionUtils.union(listA, listB);
        System.out.println(" \nОбъединение: " + union);

        Collection<Integer> intersection = collectionUtils.intersection(listA, listB);
        System.out.println("Пересечение " + intersection);

        Collection<Integer> unionWithoutDuplicate = collectionUtils.unionWithoutDuplicate(listA, listB);
        System.out.println("Объединение без дубликатов " + unionWithoutDuplicate);

        Collection<Integer> intersectionWithoutDuplicate = collectionUtils.intersectionWithoutDuplicate(listA, listB);
        System.out.println("Пересечение без дубликатов " + intersectionWithoutDuplicate);

        Collection<Integer> difference = collectionUtils.difference(listA, listB);
        System.out.println("Kоллекция, содержащая разность: " + difference);
    }
}
