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

    public String getDados () {
        String aux = "";

        aux += "ID: " + id + "\n";
        aux += "Destino: " + destino + "\n";
        aux += "Peso: " + peso + "kg\n";
        aux += "Cliente: " + cliente.getDados();
        return aux;
    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
