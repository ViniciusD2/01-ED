public class exercicio3_1 {
    public static void main(String[] args) {
        int[] idades = {15, 22, 18, 30, 12, 45, 17, 19, 21, 16};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}
