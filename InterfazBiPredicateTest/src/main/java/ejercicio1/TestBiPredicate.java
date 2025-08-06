package ejercicio1;

import java.util.function.BiPredicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        log.info("{}", bp.test(2, 3));
    }
}