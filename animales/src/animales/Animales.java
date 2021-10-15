
package animales;

import animales.service.*;

public class Animales {


    public static void main(String[] args){


        /* 
        ===============
        [ los services :p ]
        ===============
        */

        CarpinchitoService cs = new CarpinchitoService();


        /* 
        ===============
        [ Creacion de animales ]
        ===============
        */


        /* Vamos a crear el carpincho, porque si*/
        //int cms_nepe = 200;
        //CarpinchoMati carpincho_pijudo = new CarpinchoMati("Rodolfo",cms_nepe,300, true, "M");
        CarpinchoMati carpincho_normal = cs.creaCarpincho();
        System.out.println(carpincho_normal.toString()); 

        



    }
    
    
     
        

    
}
