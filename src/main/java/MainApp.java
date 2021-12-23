import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //1
        List<String> dictionary = new ArrayList<>(Arrays.asList("у", "меня", "плохая", "фантазия", "фантазия", "плохая", "вроде", "бы", "арбузы", "арбузы"));
        int count;
        Map<String, Integer> map = new HashMap<>();
        for (String str: dictionary
             ) {
            count = map.getOrDefault(str, 0);
            map.put(str, count+1);
        }
        System.out.println(map);

        //2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Шихов", "88005553535", "4864332", "236235");
        phoneBook.add("Заикина", "23746", "235235");

        System.out.println(phoneBook.get("Заикина"));

    }
}
