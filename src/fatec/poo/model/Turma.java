package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdevagas;
    private String observacoes;
    private Instrutor instrutor;
    private Curso curso;
    private ArrayList<Matricula> matriculas;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdevagas(int qtdevagas) {
        this.qtdevagas = qtdevagas;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void emitirListaFrequencia() {
        
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    public void addMatricula(Matricula mat){
        matriculas.add(mat);
        mat.setTurmas(this);
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getQtdevagas() {
        return qtdevagas;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public Curso getCurso() {
        return curso;
    }
    
}
