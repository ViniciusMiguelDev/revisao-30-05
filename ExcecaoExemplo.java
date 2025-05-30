class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExcecaoExemplo {
    static void verificar(int idade) throws MinhaExcecao {
        if (idade < 18) {
            throw new MinhaExcecao("Idade inválida!");
        }
    }

    public static void main(String[] args) {
        try {
            verificar(15);
        } catch (MinhaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
