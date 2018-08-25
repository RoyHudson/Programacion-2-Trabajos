
package Cuenta;

public class cuentapp {

	/**
	 * @param args
	 */
	
		    public static void main(String[] args) {
		         
		        Cuenta cuenta_1 = new Cuenta("Roy Hudson",1500);
		        Cuenta cuenta_2 = new Cuenta("Alfredito Gonzales", 900);
		         
		        //Ingresa dinero en las cuentas
		        cuenta_1.ingresar(300);
		        cuenta_2.ingresar(200);
		         
		        //Retiramos dinero en las cuentas
		        cuenta_1.retirar(500);
		        cuenta_2.retirar(20);
		         
		        //Muestro la informacion de las cuentas
		        System.out.println(cuenta_1); // 
		        System.out.println(cuenta_2); // 
		         
		    }
		     
		}
