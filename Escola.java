public class Escola {
    public static int calcularMedia(int A1, int A2, int A3){
        return (A1 + A2 + A3) /  3;
    }
    public static void main(String[] args) {
        int media = calcularMedia(60, 80, 70);
        if (media < 60) {
            System.out.println("Sua média é: "+ media + " REPROVADO");
        }else{
            System.out.println("Sua média é: "+ media + " APROVADO");
        }
    }
}
