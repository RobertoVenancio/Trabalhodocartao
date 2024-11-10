public class Cliente {
    private String nome;
    private String cpf;
    private String cnpj;
    private String email;
    private String telefone;
    private String cartaoCredito;


    public Cliente(String nome, String cpf, String cnpj, String email, String telefone, String cartaoCredito) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.cartaoCredito = cartaoCredito;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

   
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cartão de Crédito: " + cartaoCredito);
    }

    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("Roberto Venancio", "244.876.749-97", null, "robertovenancio21@example.com", "1234-5678", "1234 5678 9012 3456");

     
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF do cliente: " + cliente.getCpf());
        cliente.setTelefone("9876-5432");
        System.out.println("Novo telefone: " + cliente.getTelefone());

        cliente.exibirInfo();
    }
}