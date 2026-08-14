public class Biblioteca {
    public static double calcularMulta(int diasAtraso, double taxaMulta){
        return diasAtraso * taxaMulta;
    }
    public static void main(String[] args){
        int dias = 15;
        double multa = 3.0;
        double multaLivro1 = calcularMulta(dias, multa);
        double multaLivro2 = calcularMulta(dias, multa);
        System.out.println("Multa do livro 1: R$ "+ multaLivro1);
        System.out.println("Multa do livro 2: R$ "+ multaLivro2);
    }
}
