package one.digitalinnovation.gof.singleton;

/**
* singleton "preguicoso"
*
* @author julianaprado
*/

public class singletonLazy {
	
		private static singletonLazy instancia;
		
		private singletonLazy() {
			super();
		}
	
		public static singletonLazy getinstancia() {
			if (instancia == null) {
				instancia = new singletonLazy();
			}
			return instancia;
		}

}
