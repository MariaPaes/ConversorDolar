package projetoPrincipal;

import domain.Dolar;

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Dolar dolar = new Dolar();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da cotação do dólar: ");
        dolar.cotacao = sc.nextDouble();
        System.out.print("Digite o valor que você deseja ter em dólares que converterei o valor para reais: ");
        dolar.compra = sc.nextDouble();
        dolar.conversao(dolar.cotacao, dolar.compra);
        sc.close();
    }
}
