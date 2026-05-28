package lista5.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Tributavel> list = new  ArrayList<>();
		PessoaFisica p1 = new PessoaFisica("Leandro",60000,300);
		list.add(p1);
		p1.imprimirDetalhesImposto();
		
		PessoaFisica p2 = new PessoaFisica("Padrin",24000,1000);
		list.add(p2);
		p2.imprimirDetalhesImposto(true);
		
		PessoaFisica p3 = new PessoaFisica("Isabella",48000,800);
		list.add(p3);
		p2.imprimirDetalhesImposto(false);
		
		
		list.add(new PessoaJuridica("pj1",300000,10));
		System.out.println(list.get(3).calcularTributo());
		list.add(new PessoaJuridica("pj2",380000,20));
		System.out.println(list.get(4).calcularTributo());
		list.add(new PessoaJuridica("pj3",500000,13));
		System.out.println(list.get(5).calcularTributo());
		
		System.out.println("Tributo total: R$"+ ProcessadorTributos.totalizarTributos(list));
	}

}
