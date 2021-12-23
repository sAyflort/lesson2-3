import java.util.*;

public class PhoneBook {
    private Map<String, ArrayList> phoneBook = new HashMap<>();
    private ArrayList<String> listTemp = new ArrayList<>();

    public void add(String surname, String ... number) {
        if(phoneBook.containsKey(surname)) {
            listTemp = phoneBook.get(surname);
            for (int i = 0; i < number.length; i++) {
                listTemp.add(number[i]);
            }
            phoneBook.put(surname, listTemp);
            listTemp = new ArrayList<>();
        } else {
            for (int i = 0; i < number.length; i++) {
                listTemp.add(number[i]);
            }

            phoneBook.put(surname, listTemp);
            listTemp = new ArrayList<>();
        }
    }

    public ArrayList get(String surname) {
        return phoneBook.get(surname);
    }
}
