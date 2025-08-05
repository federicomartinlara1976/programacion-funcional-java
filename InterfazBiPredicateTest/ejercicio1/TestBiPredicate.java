package ejercicio1;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        log.info(bp.test(2, 3));
    }
}