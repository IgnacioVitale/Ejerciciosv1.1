import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bigSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bigSumArray(new int[]{9, 9, 9, 9, 9})));
    }

    public static int[] bigSumArray(int[] digits) {
        List<Integer> res = new ArrayList<>();
        boolean carry = true;
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] == 9 && carry) {
                res.add(0, 0);
            } else if (carry) {
                res.add(0, digits[i] + 1);
                carry = false;
            } else {
                res.add(0, digits[i]);
            }
        }
        if (carry) {
            res.add(0, 1);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
