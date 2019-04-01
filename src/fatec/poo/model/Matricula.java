package fatec.poo.model;

public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Turma turmas;
    private Aluno alunos;
    private APrazo prazo;
    private AVista vista;
    

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void emitirCarne() {
        
    }

    public void setTurmas(Turma turmas) {
        this.turmas = turmas;
    }
    
    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }    
   
    public void setPrazo(APrazo prazo) {
        this.prazo = prazo;
    }
    
    public void setVista(AVista vista) {
        this.vista = vista;
    }    
    
}
