package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Veiculo car = new Veiculo();
		car.setNome("Ferrari");
		car.setFabricante("jesus");
		car.setNroda(4);
		car.setAno(2001);
		car.setCor("vermelho");
		veiculos.add(car);//lista
		
		Veiculo car2 = new Veiculo();
		car2.setNome("Fox");
		car2.setFabricante("IFSC");
		car2.setNroda(4);
		car2.setAno(2013);
		car2.setCor("Branco");
		veiculos.add(car2);
		
		Veiculo car3 = new Veiculo();
		car3.setNome("Fusca");
		car3.setFabricante("Ilhota");
		car3.setNroda(4);
		car3.setAno(1934);
		car3.setCor("Roxo");
		veiculos.add(car3);

		for(Veiculo veiculo : veiculos) { // foreach + Ctrl + barra de espaço 
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNroda());
		}
	}

}
