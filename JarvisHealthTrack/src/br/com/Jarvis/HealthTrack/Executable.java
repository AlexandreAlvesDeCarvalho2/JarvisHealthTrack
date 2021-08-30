package br.com.Jarvis.HealthTrack;

public class Executable {

	public static void main(String[] args) {
		/**
		 * cria uma variável altura que extende a classe Altura
		 */
		Altura altura = new Altura(1.71, "30/08/21");
		

		System.out.println("---------------------------------------------");
		System.out.print("Sua altura em " +altura.getDataAltura());
		System.out.println(" é de " + altura.getAltura());
		
		/**
		 * cria uma variável atividades que extende a classe Atividade
		 */
		Atividade atividades = new Atividade("Corrida","30/08/21","1:23:45","520 kcal");
		

		System.out.println("---------------------------------------------");
		System.out.println("Atividade: "  + atividades.getNomeAtividade());
		System.out.println("Data: "  + atividades.getDataAtividade());
		System.out.println("Duração: "  + atividades.getTempoTotalAtividade());
		System.out.println("Calorias: "  + atividades.getCaloriaAtividade());
		System.out.println("---------------------------------------------");
	}
}
