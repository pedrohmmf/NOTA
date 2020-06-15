/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovado_reprovado;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class APROVADO_REPROVADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite sua primeira nota:");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        double nota2 = entrada.nextDouble();
        double media1 = (nota1+nota2) / 2;
        double media2 = 0;
        if(media1 >= 7)
            System.out.println("APROVADO" + media1);
        else if(media1 < 7)
        {
            System.out.println("Digite a nota do exame:");
            double nota3 = entrada.nextDouble();
            media2 = (media1+nota3) / 2;
        
            if (media2 >= 5)
                System.out.println("Aprovado" + media2 );
            else
                System.out.println("Reperovado" + media2);
        }
            
            
            
        // TODO code application logic here
    }
    
}
