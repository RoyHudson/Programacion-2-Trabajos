
package hello.world;
import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class HelloWorld {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n;
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("ingrese el número uno: ");
        n = scan.nextFloat();
        
        if( n == 1){
            System.out.println("Ha ingresado el número uno");
        }
        else{
            System.out.println("No ha ingresado el número uno");
        }
        
    }
    
}
