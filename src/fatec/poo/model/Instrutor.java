package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor extends Pessoa {
    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmas;

    public Instrutor(String nome, String cpf) {
        super(cpf, nome);
        turmas = new ArrayList<Turma>();
    }
    
    public void addTurma(Turma t){
         turmas.add(t);
         t.setInstrutor(this);
        
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
}
