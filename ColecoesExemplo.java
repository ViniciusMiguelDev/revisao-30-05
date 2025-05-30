import java.util.*;

public class ColecoesExemplo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Java");  // Pode repetir

        Set<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Java");  // Não adiciona duplicado

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Java");
        mapa.put(2, "Spring");

        System.out.println(lista);
        System.out.println(conjunto);
        System.out.println(mapa);
    }
}
