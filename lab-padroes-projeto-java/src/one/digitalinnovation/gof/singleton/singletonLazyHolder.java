package one.digitalinnovation.gof.singleton;

/**
* singleton "lazyHolder"
*
* @author julianaprado
*/

public class singletonLazyHolder {
	
		private static class instanceLazyHolder {
		public static singletonLazyHolder instancia = new singletonLazyHolder();
		}
		
		private singletonLazyHolder() {
			super();
		}
	
		public static singletonLazyHolder getinstancia() {
			return instanceLazyHolder.instancia;
			}
		}