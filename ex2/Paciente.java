package ex2;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private ArrayList<Consulta> historicoConsultas;

    public Paciente(String nome) {
        this.nome = nome;
        this.historicoConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        historicoConsultas.add(consulta);
    }

   
    public void mostrarConsultas() {
        System.out.println("=== Consultas do paciente: " + nome + " ===");
        for (int i = 0; i < historicoConsultas.size(); i++) {
            Consulta c = historicoConsultas.get(i);
            System.out.println("Data: " + c.getData() + " | Médico: " + c.getMedicoResponsavel().getNome());
        }
        System.out.println("\n=================================================");
    }

    
    public void mostrarProntuarios() {
        System.out.println("--- Prontuários do paciente: " + nome + " ---");
        for (int i = 0; i < historicoConsultas.size(); i++) {
            Consulta c = historicoConsultas.get(i);
            System.out.println("Data da Consulta: " + c.getData());
            System.out.println("Anotações: " + c.getProntuario().getDescricao());
            System.out.println("-");
        }
        System.out.println("\n=================================================");
    }
}