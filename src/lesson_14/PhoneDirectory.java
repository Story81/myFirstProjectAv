package lesson_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    private Map<String, ArrayList<String>> phonesMap = new HashMap<>();


    public void add(String surname, String number) {
        if (!phonesMap.containsKey(surname)) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(number);
            phonesMap.put(surname, phones);
        } else {
            ArrayList<String> phones = phonesMap.get(surname);
            phones.add(number);
        }
    }

    public void print() {
        System.out.println("Записная книжка: " );
        for (Map.Entry<String, ArrayList<String>> entry : phonesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    public ArrayList<String> get(String surname) {
        System.out.print("\nВсе телефоны по фамилии " + surname + ": ");
        return  phonesMap.get(surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneDirectory that = (PhoneDirectory) o;

        return phonesMap.equals(that.phonesMap);
    }

    @Override
    public int hashCode() {
        return phonesMap.hashCode();
    }

}

