package br.edu.catolica.es;

import br.edu.catolica.es.filizola.Filizola;
import br.edu.catolica.es.toledo.Toledo;
import br.edu.catolica.es.urano.Urano;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var produto = new Produto();
        ArrayList<Produto> listaProduto = new ArrayList<>();

        System.out.print("Preencha este campo com o código do produto: ");
        produto.setCodigo(scanner.nextInt());

        System.out.print("Preencha este campo com o tipo do produto - P/U: ");
        produto.setTipo(scanner.next());

        scanner.nextLine();
        System.out.print("Preencha este campo com a dscrição do produto: ");
        produto.setDescricao(scanner.nextLine());

        System.out.print("Preencha este campo com o valor do produto: ");
        produto.setValor(scanner.nextDouble());

        listaProduto.add(produto);

        var toledo = new Toledo();
        toledo.exportar(listaProduto, "C:\\Users\\NETLINE\\projetos-java\\balancas_java");

        var urano = new Urano();
        urano.exportar(listaProduto, "C:\\Users\\NETLINE\\projetos-java\\balancas_java");

        var filizola = new Filizola();
        filizola.exportar(listaProduto, "C:\\Users\\NETLINE\\projetos-java\\balancas_java");
    }
}