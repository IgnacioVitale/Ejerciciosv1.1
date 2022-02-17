import java.util.HashMap;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        return climbStairs(n, new HashMap<>());
    }

    private static int climbStairs(int n, HashMap<Integer, Integer> mapa) {
        int sum = 0;
        if (n < 0) return 0;
        if (mapa.containsKey(n)) return mapa.get(n);
        if (n == 0) return sum + 1;
        sum = climbStairs(n - 1, mapa) + climbStairs(n - 2, mapa);
        mapa.put(n, sum);
        return sum;
    }
}
