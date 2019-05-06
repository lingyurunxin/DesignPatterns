import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int[] numbers) {
        StringBuilder s = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        list.sort((o1, o2) -> {
            String str1 = o1 + "" + o2;
            String str2 = o2 + "" + o1;
            return str1.compareTo(str2);
        });

        for (Integer integer : list) {
            s.append(integer);
        }
        return s.toString();
    }
}