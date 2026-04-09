package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.util.Random;

public class Carga {
    private int id;
    private String destino;
    private double peso;
    private Cliente cliente;

    public Carga (String destino, Cliente cliente) {
        Random random = new Random();
        this.destino = destino;
        this.cliente = cliente;
        this.id = random.nextInt(1000, 9999);
        this.peso = random.nextDouble(1000, 5000);
    }
}
