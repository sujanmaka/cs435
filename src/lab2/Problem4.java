package lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(2);

        System.out.println(removeDups(l));
    }

    public static List<Integer> removeDups(List<Integer> list) {
        List<Integer> m = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) {
            map.put(integer, 1);
        }

        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                m.add(integer);
                map.remove(integer);
            }
        }
//
//        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
//            m.add(mapElement.getKey());
//        }
        return m;
    }
}
