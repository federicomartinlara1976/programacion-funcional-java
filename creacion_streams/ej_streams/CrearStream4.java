package ej_streams;

public class CrearStream4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        
        // Interface CharSequence
        IntStream streamChars = entrada.chars();
        
        streamChars.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
            .forEach(System.out::print);

        String str = "HTML, CSS, JavaScript, Java, C++, C#, RUBY";
        Pattern.compile(", ")
            .splitAsStream(str)
            .forEach(System.out::println);
            
        scanner.close();
    }
}