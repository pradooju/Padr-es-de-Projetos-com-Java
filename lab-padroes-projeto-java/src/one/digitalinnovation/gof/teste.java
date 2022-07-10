package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.facade;
import one.digitalinnovation.gof.singleton.singletonEager;
import one.digitalinnovation.gof.singleton.singletonLazy;
import one.digitalinnovation.gof.singleton.singletonLazyHolder;
import one.digitalinnovation.gof.strategy.comportamento;
import one.digitalinnovation.gof.strategy.comportamentoAgressivo;
import one.digitalinnovation.gof.strategy.comportamentoDefensivo;
import one.digitalinnovation.gof.strategy.comportamentoNormal;
import one.digitalinnovation.gof.strategy.robo;

public class teste {
	
	public static void main (String[] args) {
		
		//**Testes relacionados ao design singleton**//
		
		singletonLazy lazy = singletonLazy.getinstancia();
		System.out.println(lazy);
		lazy = singletonLazy.getinstancia();
		System.out.println(lazy);
		
		singletonEager	eager = singletonEager.getinstancia();
		System.out.println(eager);
		eager = singletonEager.getinstancia();
		System.out.println(eager);
		
		singletonLazyHolder LazyHolder = singletonLazyHolder.getinstancia();
		System.out.println(LazyHolder);
		LazyHolder = singletonLazyHolder.getinstancia();
		System.out.println(LazyHolder);
		
		
		//**strategy**//
		
		comportamento normal = new comportamentoNormal();
		comportamento defensivo = new comportamentoDefensivo();
		comportamento agressivo = new comportamentoAgressivo();
		
		robo robo = new robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		//**facade
		
		facade facade = new facade();
		facade.migrarCliente("Juliana", 38000000);
		
	}

}
