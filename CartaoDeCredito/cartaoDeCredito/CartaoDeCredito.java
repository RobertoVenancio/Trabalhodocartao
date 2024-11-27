package cartaoDeCredito;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartaoDeCredito {
    private String numeroCartao;
    private String titular;
    private double limiteCredito;
    private List<Transacao> historicoDeTransacoes;

    
    public CartaoDeCredito(String numeroCartao, String titular, double limiteCredito) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.historicoDeTransacoes = new ArrayList<>();  
    }

   
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public List<Transacao> getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    public void setHistoricoDeTransacoes(List<Transacao> historicoDeTransacoes) {
        this.historicoDeTransacoes = historicoDeTransacoes;
    }

   
    public void adicionarTransacao(Transacao transacao) {
        historicoDeTransacoes.add(transacao);
    }

   
    public void exibirHistorico() {
        if (historicoDeTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao transacao : historicoDeTransacoes) {
                System.out.println(transacao);
            }
        }
    }

   
    @Override
    public String toString() {
        return "CartaoDeCredito{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", titular='" + titular + '\'' +
                ", limiteCredito=" + limiteCredito +
                '}';
    }

       public static void main(String[] args) {
   
        CartaoDeCredito cartao = new CartaoDeCredito("4321 2976 1802 5432", "RobertoVenan", 5000.00);

      
        Transacao transacao1 = new Transacao(new Date(), 300.29, "Compra de material de escritório");
        Transacao transacao2 = new Transacao(new Date(), 199.99, "Pagamento de serviço");

        
        cartao.adicionarTransacao(transacao1);
        cartao.adicionarTransacao(transacao2);

       
        System.out.println("Histórico de Transações do Cartão:");
        cartao.exibirHistorico();
    }
}
 