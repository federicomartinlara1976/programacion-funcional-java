package ejercicio1;

import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = valor -> valor > 0;

        log.info("{}", predicate.test(123));
    }
}