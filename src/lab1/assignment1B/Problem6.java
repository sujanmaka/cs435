package lab1.assignment1B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem6 {
    public static void main(String[] args) {
        List list = new ArrayList() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        List<Set> subsets = powerSet(list);

        for (Set subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<Set> powerSet(List list) {
        List<Set> result = new ArrayList<>();
        subsetsHelper(result, new ArrayList<>(), list, 0);
        return result;
    }

    private static void subsetsHelper(List<Set> list, List resultList, List nums, int start) {
        list.add(new HashSet(resultList));
        for (int i = start; i < nums.size(); i++) {
            // add element
            resultList.add(nums.get(i));
            // Explore
            subsetsHelper(list, resultList, nums, i + 1);
            // remove
            resultList.remove(resultList.size() - 1);
        }

    }
}
