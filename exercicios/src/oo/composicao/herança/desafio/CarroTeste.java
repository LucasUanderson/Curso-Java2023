package oo.composicao.herança.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Fusca fusca = new Fusca();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.frear();
		
		
		System.out.println( fusca);
		
		Fusion fusion = new  Fusion();
		fusion.ligarTurbo();
		fusion.acelerar();
		fusion.acelerar();
		fusion.acelerar();
		fusion.acelerar();
		fusion.frear();
		fusion.desligarTurbo();
		
		System.out.println(fusion);
	}

}
