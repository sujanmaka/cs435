package lab1.assignment1A;


import lab1.powerset.PowerSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList() {
            {
                add(1);
                add(3);
                add(9);
                add(4);
                add(8);
                add(5);
            }
        };
        System.out.println(sumFound(list, 21));
    }

    public static boolean sumFound(List list, int k) {
        List<Set<Integer>> subsetList = PowerSet.powerSet(list);
        for (Set<Integer> integers : subsetList) {
            if (integers.stream().mapToInt(Integer::intValue).sum() == k) {
                return true;
            }
        }

        return false;
    }

}
