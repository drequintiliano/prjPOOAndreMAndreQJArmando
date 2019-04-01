package fatec.poo.model;

import java.util.ArrayList;

public class Curso {
    private String sigla;
    private String nome;
    private int cargahoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        turmas = new ArrayList<Turma>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public void addTurma(Turma t){
        turmas.add(t);
        t.setCurso(this);        
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

    public String getPrograma() {
        return programa;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    
    
}
