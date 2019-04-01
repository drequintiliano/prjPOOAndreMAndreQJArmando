package fatec.poo.model;

public class APrazo {
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;
    private Matricula matricula;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros/100;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }
    
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
}
