package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop pc = new Desktop();
		pc.setCodBarras(123456987456l);
		pc.setFabricante("Positivo");
		pc.setGamer(false);
		
		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Teclado");
		pecas.add("Mouse");
		pecas.add("Monitor");
		pc.setPecas(pecas);
		
		Desktop pc2 = new Desktop();
		pc2.setCodBarras(9874563211223l);
		pc2.setFabricante("Pichau");
		pc2.setGamer(true);
		
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Teclado");
		pecas2.add("Mouse com fio");
		pecas2.add("Monitor");
		pc2.setPecas(pecas2);
		
		Desktop pc3 = new Desktop();
		pc3.setCodBarras(2164652315613l);
		pc3.setFabricante("Lg");
		pc3.setGamer(false);
		
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Teclado");
		pecas3.add("Mouse com fio");
		pecas3.add("Monitor");
		pc3.setPecas(pecas3);
		
		desktops.add(pc);
		desktops.add(pc2);
		desktops.add(pc3);
		
		for (String desktop : pecas) {
			System.out.println();
			
		}
		System.out.println("");
		
		ArrayList<Smartphone> celular = new ArrayList<>();
		
		Smartphone cel = new Smartphone();
		cel.setFabricante("Isabelle");
		cel.setCodBarras(123456l);
		cel.setCor("Roxa");
		cel.setDimensoesTela("4.0");
		celular.add(cel);
		
		Smartphone cel2 = new Smartphone();
		cel2.setFabricante("Eduarda");
		cel2.setCodBarras(789456l);
		cel2.setCor("Rosa");
		cel2.setDimensoesTela("5");
		celular.add(cel2);
		
		Smartphone cel3 = new Smartphone();
		cel3.setFabricante("Maria");
		cel3.setCodBarras(357951l);
		cel3.setCor("Preto");
		cel3.setDimensoesTela("4.5");
		celular.add(cel3);
		
		for (Smartphone smartphone : celular) {
			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
			System.out.println("");
			
			
		}
	
	}
}
