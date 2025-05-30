package Locadora;

import java.util.ArrayList;
import java.util.List;

enum TipoDeVeiculo {
    CARRO,
    MOTO,
    CAMINHAO
}

enum Marca {
    FORD,
    CHEVROLET,
    HONDA,
    YAMAHA
}

class Veiculo {
    private TipoDeVeiculo tipo;
    private Marca marca;
    private String modelo;
    private int ano;

    public Veiculo(TipoDeVeiculo tipo, Marca marca, String modelo, int ano) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public TipoDeVeiculo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Veiculo: " + "Tipo= " + tipo +
                ", Marca= " + marca +
                ", Modelo= '" + modelo + '\'' +
                ", Ano= " + ano;
    }
}

class SistemaDeLocacao {
    private List<Veiculo> veiculosDisponiveis = new ArrayList<>();

    public String adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
        return "Veículo adicionado com sucesso!";
    }

    public void listarVeiculos() {
        if (veiculosDisponiveis.isEmpty()) {
            System.out.println("Nenhum veículo disponível.");
        } else {
            veiculosDisponiveis.forEach(System.out::println);
        }

    }

    public void buscarPorMarca(Marca marca) {
        veiculosDisponiveis.stream().filter(c -> c.getMarca() == marca).forEach(System.out::println);
    }
}

public class Main {

    public static void main(String[] args) {
        SistemaDeLocacao sistema = new SistemaDeLocacao();

        Veiculo carro = new Veiculo(TipoDeVeiculo.CARRO, Marca.FORD, "Fiesta", 2020);
        Veiculo moto = new Veiculo(TipoDeVeiculo.MOTO, Marca.HONDA, "CB500", 2019);
        Veiculo caminhão = new Veiculo(TipoDeVeiculo.CAMINHAO, Marca.FORD, "Caminhão X", 2021);

        sistema.adicionarVeiculo(carro);
        sistema.adicionarVeiculo(moto);
        sistema.adicionarVeiculo(caminhão);

        sistema.listarVeiculos();
        sistema.buscarPorMarca(Marca.FORD);
    }
}
