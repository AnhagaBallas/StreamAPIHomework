import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) <= 0) {
                intList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 != 0) {
                intList.remove(i);
                i--;
            }
        }
        intList.sort(Comparator.naturalOrder());

        System.out.println(intList);


    }
}
