package estangaej8;
import java.util.Scanner;
import Librerias.Programas;

public class Estangaej8 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        String confirm2="", si="si", no="no", confirm="No Disponible";
        int opc1=0, opc2=0;
        
        
                    System.out.println("\n==== BIENVENIDO ====");
                    
                    while (opc1>3 || opc1<1){
                        System.out.println("\nOpciòn | Tipo de Ropa");
                        System.out.println("   1   | DELICADA");
                        System.out.println("   2   | LAVADO PROFUNDO");
                        System.out.println("   3   | ECONOMICO");
                        System.out.println("\nINGRESE LA OPCIÒN DEL TIPO DE ROPA: ");
                        opc1 = ingresar.nextInt();
                        if (opc1>3 || opc1<1){
                            System.out.println("\n====OPCIÒN INVALIDA====");
                        }
                    }
                    
                    while (opc2>3 || opc2<1){
                        System.out.println("\nOpciòn | Peso Estimado");
                        System.out.println("   1   | 1kg a 3kg");
                        System.out.println("   2   | 3kg a 5kg");
                        System.out.println("   3   | 5kg a 8kg");
                        System.out.println("\nINGRESAR LA OPCIÒN DEL PESO: ");
                        opc2 = ingresar.nextInt();
                        if (opc2>3 || opc2<1){
                            System.out.println("\n====OPCIÒN INVALIDA====");
                        }
                    }
                    //Creo objeto
                    Programas mensajero = new Programas(opc1,opc2,confirm);
                        mensajero.complet();
                        if (opc1 == 1) {
                            mensajero.setOpc1(4);
                            mensajero.setTipodeRopa("DELICADA");
                        }
                        if (opc1 == 2){
                            mensajero.setTipodeRopa("LAVADO PROFUNDO");
                        }
                        if (opc1 == 3){
                            mensajero.setTipodeRopa("ECONOMICO");
                        }
       
                        if (opc2 == 1){
                            mensajero.setTipodellenado("1kg a 3kg");
                        }
                        if (opc2 == 2){
                            mensajero.setTipodellenado("3kg a 5kg");
                        }
                        if (opc2 == 3){
                            mensajero.setTipodellenado("5kg a 8kg");
                        }
                        mensajero.setOpsecar(confirm);
                        //mensajero.complet();
                        mensajero.display();
                    
                    System.out.println("\n¿COMENZAR A LAVAR? Responda con SI o NO :");
                    confirm2 = ingresar.next();
                    if (confirm2.equalsIgnoreCase(no)) {
                        System.exit(0);
                    }
                    if (confirm2.equalsIgnoreCase(si)) {
                        System.out.println("\n==== LAVANDO ====");
                        System.exit(0);
                    }
    }
    
}
