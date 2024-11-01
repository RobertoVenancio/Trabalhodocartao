public class Cartao {
    private String numero;
    

private String nomeTitular;
private double limiteCredito;
    private double taxaCashback;

    public Cartao(String numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.limiteCredito = 1000.0; 
        this.taxaCashback = 0.0; 
    }


    public Cartao(String numero, String nomeTitular, double limiteCredito, double taxaCashback) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.limiteCredito = limiteCredito;
        this.taxaCashback = taxaCashback;
    }

   
    public boolean comprar(double valor) {
        if (valor <= limiteCredito) {
            limiteCredito -= valor;
            
            System.out.println("Compra realizada: R$" + valor);
            return true;
        } else {
            System.out.println("Limite insuficiente para a compra de R$" + valor);
            return false;
        }
    }


    public boolean comprar(double valor, boolean comCashback) {
        if (comCashback) {
            if (valor <= limiteCredito) {
                limiteCredito -= valor;
                double cashback = valor * taxaCashback;
                limiteCredito += cashback; 

                System.out.println("Compra realizada com cashback: R$" + valor + ". Cashback de R$" + cashback);
                return true;
            } else {

                System.out.println("Limite insuficiente para a compra de R$" + valor);
                return false;
            }
        } else {
            return comprar(valor); 
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTaxaCashback() {
        return taxaCashback;
    }

    public void setTaxaCashback(double taxaCashback) {
        this.taxaCashback = taxaCashback;
    }
}
