import java.util.*;
import java.util.stream.Collectors;

public class StreamExemplo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

        List<String> filtrados = nomes.stream()
            .filter(n -> n.startsWith("B"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(filtrados);  // [BRUNO]
    }
}
