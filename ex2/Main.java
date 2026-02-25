package ex2;

public class Main {
    public static void main(String[] args) {
        
        Medico medico1 = new Medico("Dr. Roberto");
        Medico medico2 = new Medico("Dra. Ana");

        
        Paciente paciente = new Paciente("Carlos Silva");

       
        Consulta c1 = new Consulta("10/05/2023", medico1, "Paciente com febre e dor de garganta. Receitado dipirona.");
        Consulta c2 = new Consulta("15/08/2023", medico2, "Retorno. Paciente curado, sem sintomas.");

       
        paciente.adicionarConsulta(c1);
        paciente.adicionarConsulta(c2);

        paciente.mostrarConsultas();
        System.out.println();
        paciente.mostrarProntuarios();
    }
}