import java.util.List;

public class MethodReferenceSample {
    public static void main(String[] args) {
        var names = List.of("shimomura","saeki","tanaka","kiyota");
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);
        names.stream().map("%sさん"::formatted).toList().forEach(System.out::println);
    }
}
