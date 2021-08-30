package br.com.Jarvis.HealthTrack;

public class Executable {

	public static void main(String[] args) {
		/**
		 * cria uma vari�vel altura que extende a classe Altura
		 */
		Altura altura = new Altura(1.71, "30/08/21");
		

		System.out.println("---------------------------------------------");
		System.out.print("Sua altura em " +altura.getDataAltura());
		System.out.println(" � de " + altura.getAltura());
		
		/**
		 * cria uma vari�vel atividades que extende a classe Atividade
		 */
		Atividade atividades = new Atividade("Corrida","30/08/21","1:23:45","520 kcal");
		

		System.out.println("---------------------------------------------");
		System.out.println("Atividade: "  + atividades.getNomeAtividade());
		System.out.println("Data: "  + atividades.getDataAtividade());
		System.out.println("Dura��o: "  + atividades.getTempoTotalAtividade());
		System.out.println("Calorias: "  + atividades.getCaloriaAtividade());
		System.out.println("---------------------------------------------");
	}
}
