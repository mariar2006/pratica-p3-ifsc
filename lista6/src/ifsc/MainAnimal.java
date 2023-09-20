package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro bobo = new Cachorro();
		bobo.setNome("jujuba");
		bobo.setRaca("Doberman");
		bobo.setNumdepatas(4);
		bobo.setCor("preto");
		bobo.setComprimento(50.8f);
		bobo.setEcossistema("natureza");
		
		Gato fofo = new Gato();
		fofo.setNome("belle");
		fofo.setRaca("arabe");
		fofo.setNumdepatas(4);
		fofo.setCor("preto");
		fofo.setComprimento(23.7f);
		fofo.setEcossistema("natureza");
		
		bobo.late();
		System.out.println(bobo.getNome());
		System.out.println(bobo.getRaca());
		System.out.println(bobo.getNumdepatas());
		System.out.println(bobo.getCor());
		System.out.println(bobo.getComprimento());
		System.out.println(bobo.getEcossistema());
		
		System.out.println("");
		
		fofo.mia();
		System.out.println(fofo.getCor());
		System.out.println(fofo.getNome());
		System.out.println(fofo.getRaca());
		System.out.println(fofo.getNumdepatas());
		System.out.println(fofo.getCor());
		System.out.println(fofo.getEcossistema());

		
		

	}

}
