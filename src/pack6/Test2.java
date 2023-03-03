package pack6;

import jdk.internal.dynalink.linker.LinkerServices;
import pack1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public String name;
    public String color;
    public int age;

    public Test2(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args) {


        Test2 test1 = new Test2("Apple", "red", 15);
        Test2 test2 = new Test2("Pear", "yellow", 12);
        Test2 test3 = new Test2("Coconut", "white", 3);
        Test2 test4 = new Test2("Plum", "blue", 45);

        List<Test2> fru = new ArrayList<>();
        fru.add(test1);
        fru.add(test2);
        fru.add(test3);
        fru.add(test4);

        for (int i = 0; i < fru.size(); i++) {
            fru.set(i, fru.get(i).length());
        }

        Stream<Test2> stream = fru.stream().filter(fru.color).collect(Collectors.toList());
        System.out.println(fru);

    }
}
