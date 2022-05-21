package test;

import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable();
        hashtable.put(1, "sujan");

        System.out.println(hashtable.get(1));
    }
}
