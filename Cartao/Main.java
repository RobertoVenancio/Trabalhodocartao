public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Cartao cartao1 = new Cartao("1234-5678-9012-3456", "RobertoVenancio");
        
    
        cartao1.comprar(900.0);
        System.out.println("Limite restante: R$" + cartao1.getLimiteCredito());

       Cartao cartao2 = new Cartao("9876-5432-1098-7654", "Josimeire Oliveira", 2000.0, 0.05);


        cartao2.comprar (322.0, true);

        System.out.println

("Limite restante: R$" + cartao2.getLimiteCredito());

    }
}

    