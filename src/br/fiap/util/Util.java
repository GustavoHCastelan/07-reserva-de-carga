package br.fiap.util;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

import javax.swing.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {

    private Viagem viagem = new Viagem();

    public void menu () {
        int opcao;
        String aux = "Reserva de Cargas Boa Viagem\n";
        aux += "[1] Reservar\n";
        aux += "[2] Pesquisar\n";
        aux += "[3] Exibir\n";
        aux += "[4] Capacidade reservada\n";
        aux += "[5] Cancelar\n";
        aux += "[6] Finalizar\n";

        do { //MENU não entra em laço de repetição
            opcao = parseInt(showInputDialog(aux));
            switch (opcao){
                case 1 -> reservar();
                case 2 -> pesquisar();
                case 3 -> exibir();
                case 5 -> cancelar();
                case 6 -> showMessageDialog(null, "Até breve");
                default -> showMessageDialog(null, "Opção inválida");
            }
        } while(opcao != 6);


    }

    private void cancelar() {
    }

    private void pesquisar() {

    }

    private void pesquisarId() {
        int id = parseInt(showInputDialog("ID para pesquisa"));
        for (int i = 0; i < viagem.getIndex(); i++) {

        }
    }

    private void exibir() {
        showMessageDialog(null, viagem.getDados());
    }

    private void reservar() {
        int cnpj;
        String destino, nomeCliente;

        cnpj = parseInt(showInputDialog("CNPJ"));
        destino = showInputDialog("Destino");
        nomeCliente = showInputDialog("Nome do cliente");

        Cliente cliente = new Cliente(cnpj, nomeCliente);
        Carga carga = new Carga(destino, cliente);

        if (viagem.reservar(carga)){
            showMessageDialog(null, "Carga reservada com sucesso!");
        }else {
            showMessageDialog(null, "ERRO! Entre em contato no 0800");
        }
    }
}
