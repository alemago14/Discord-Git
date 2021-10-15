package animales.service;

import animales.CarpinchoMati;

import java.util.Scanner;


public class CarpinchitoService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\r?\n");

    public CarpinchoMati creaCarpincho()
    {
        boolean tabien = false;

        String Nombre = "", Setso = "", Temp = "no";
        boolean HinchaDeBoca = false;
        int Peso = 0, CmsNepe = 0;

        //Nombre
        while(!tabien){
            try {
                System.out.println("Ingrese nombre del mejor carpincho de la historia:");
                Nombre = sc.next();
                tabien = true;
            } catch (Exception e) {
                System.err.println("Master, ponele bien el nombre al carpincho >:(");
                tabien = false;
                continue;
            }

            if(Nombre.isEmpty())
                tabien = false;

        } tabien = false;

        //Sexo
        while(!tabien){
            try {
                System.out.println("Carpincho o Carpincha? ingrese el secso del carpinchito M o F");
                Setso = sc.next();
                tabien = true;
            } catch (Exception e) {
                System.err.println("Ponele bien el setso >:(");
                tabien = false;
                continue;

            }

            if(Setso.isEmpty())
                tabien = false;

            else if( tabien = true )
            {
                if( !Setso.equalsIgnoreCase("m") && !Setso.equalsIgnoreCase("f") )
                {
                    System.out.println("\nMe volves a poner el sexo del carpincho, dije m o f\n");
                    tabien = false;
                }
            }

        } tabien = false;

        //Cmds nepe
        if(Setso.equalsIgnoreCase("m"))
        {
            while(!tabien){
                try {
                    System.out.println("Ingrese los cms del nepe");
                    CmsNepe = sc.nextInt();
                    tabien = true;
                } catch (Exception e) {
                    System.err.println ("Solo pon un número >:(");
                    tabien = false;
                    continue;

                }
            } tabien = false;
        }
      
        //Peso
        while(!tabien){
            try {
                System.out.println("Ingrese los kg del carpincho");
                Peso = sc.nextInt();
                tabien = true;
            } catch (Exception e) {
                System.err.println ("Solo pon un número >:(");
                tabien = false;
                continue;

            }
        } tabien = false;
        
        //Hincha de boca
        while(!tabien){
            
            try {
                System.out.println("Es hincha de boca? coloca si o no");
                Temp = sc.next();
                tabien = true;
            } catch (Exception e) {
                System.err.println("[ ERROR ] Escribilo bien -_-");
                tabien = false;
                continue;
            }

            if(Temp.isEmpty())
                tabien = false;

            else if( tabien = true )
            {
                if( Temp.equalsIgnoreCase("si") )
                    HinchaDeBoca = true;

                else if( Temp.equalsIgnoreCase("no") )
                    HinchaDeBoca = false;

                else{
                    System.out.println("[ ERROR ] Solo tenias que poner si o no.....");
                    tabien = false;
                }
            }

        } tabien = false;

        CarpinchoMati c = new CarpinchoMati(Nombre,CmsNepe,Peso, HinchaDeBoca,Setso);
        sc.close();

        return c;
    }

}