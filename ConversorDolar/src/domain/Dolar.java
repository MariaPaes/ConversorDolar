package domain;

public class Dolar {
    public double cotacao;
    public double compra;
    public void conversao (double num1, double num2) {
        double converter = num1 * num2;
        double iof = converter * 0.06;
        double valorTotalAPagar =  converter + iof;
        System.out.println("Você deve pagar R$ "  + valorTotalAPagar + " pelos dolares que deseja ter.");

    }
}
