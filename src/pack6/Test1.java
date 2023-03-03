package pack6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {

    public static HashMap<Integer, String> createHashMap(ArrayList<String> bookList) {
        HashMap<Integer, String> bookHashMap = new HashMap<>();
        for (int i = 0; i < bookList.size(); i++) {
            bookHashMap.put(i, bookList.get(i));
        }
        return bookHashMap;
    }

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Book 1");
        bookList.add("Book 2");
        bookList.add("Book 3");
        bookList.add("Book 4");
        bookList.add("Book 5");


        HashMap<Integer, String> bookHashMap = createHashMap(bookList);
        System.out.println(bookHashMap);
    }

}
