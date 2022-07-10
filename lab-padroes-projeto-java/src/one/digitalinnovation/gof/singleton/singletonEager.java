package one.digitalinnovation.gof.singleton;

/**
* singleton "apressado"
*
* @author julianaprado
*/

public class singletonEager {
	
		private static singletonEager instancia = new singletonEager();
		
		private singletonEager() {
			super();
		}
	
		public static singletonEager getinstancia() {
			return instancia;
			}
		}

