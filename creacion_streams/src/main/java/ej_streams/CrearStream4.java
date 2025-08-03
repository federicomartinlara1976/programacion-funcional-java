package ej_streams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrearStream4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        
        // Interface CharSequence
        IntStream streamChars = entrada.chars();
        
        streamChars.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
            .forEach(caracter -> log.info("{}", caracter));

        String str = "HTML, CSS, JavaScript, Java, C++, C#, RUBY";
        Pattern.compile(", ")
            .splitAsStream(str)
            .forEach(cadena -> log.info("{}", cadena));
            
        scanner.close();
    }
}