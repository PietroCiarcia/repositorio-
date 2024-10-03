public class ProdutoNumeros {
    public static void main(String[] args) {
        long produto = 1;          
        for (int i = 120; i <= 300; i++) {
            produto *= i;  
        }
        
        System.out.println("Produto de todos os números de 120 a 300: " + produto);
    }
}
