public class exercicio2_2 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 33, 42, 19, 20, 7, 10, 25};

        System.out.println("Números pares do vetor:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
