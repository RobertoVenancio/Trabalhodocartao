public class CartaoDeCredito {
    private String numero;
    private String dataValidade;
    private static String codigoSeguranca;
        private Cliente cliente;  
    
    
        public CartaoDeCredito(String numero, String dataValidade, String codigoSeguranca, Cliente cliente) {
            this.numero = numero;
            this.dataValidade = dataValidade;
            this.codigoSeguranca = codigoSeguranca;
            this.cliente = cliente;  
        }
    
        
        public String getNumero() {
            return numero;
        }
    
        public String getDataValidade() {
            return dataValidade;
        }
    
        public String getCodigoSeguranca() {
            return codigoSeguranca;
        }
    
        public Cliente getCliente() {
            return cliente;
        }
    
        public void setNumero(String numero) {
            this.numero = numero;
        }
    
        public void setDataValidade(String dataValidade) {
            this.dataValidade = dataValidade;
        }
    
        public void setCodigoSeguranca(String codigoSeguranca) {
            this.codigoSeguranca = codigoSeguranca;
        }
    
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
    
      
        public void exibirInfo() {
            System.out.println("Número do Cartão: " + numero);
            System.out.println("Data de Validade: " + dataValidade);
            System.out.println("Código de Segurança: " + codigoSeguranca);
            System.out.println("Titular: " + cliente.getNome());  
        }
    
        public static void main(String[] args) {
       
            Cliente cliente = new Cliente("RobertoVenancio", "244.876.749-97", null, "robertovenancio21@example.com", "9876-5432", codigoSeguranca);


        CartaoDeCredito cartao = new CartaoDeCredito("1234 5678 9012 3456", "12/25", "123", cliente);

        cartao.exibirInfo();

    }
}