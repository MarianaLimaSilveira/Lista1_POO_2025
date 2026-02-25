package ex2;

public class Consulta {
    private String data;
    private Medico medicoResponsavel;
    private Prontuario prontuario; 

   
    public Consulta(String data, Medico medicoResponsavel, String anotacaoDoMedico) {
        this.data = data;
        this.medicoResponsavel = medicoResponsavel;
        
        
        this.prontuario = new Prontuario(anotacaoDoMedico); 
    }

    public String getData() {
        return data;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
}