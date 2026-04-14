package br.fiap.cliente;

public class Cliente {
    private int cnpj;
    private String cliente;

    public Cliente (int cnpj, String cliente) {
        this.cnpj = cnpj;
        this.cliente = cliente;
    }

    public String getCliente () {
        return cliente;
    }

    public void setCliente () {
        this.cliente = cliente;
    }

    public int getCnpj () {
        return cnpj;
    }

    public String getDados () {
        String aux = "";

        aux += "CNPJ : "+ cnpj + "\n";
        aux += "Cliente : "+ cliente + "\n";
        return aux;
    }

}
