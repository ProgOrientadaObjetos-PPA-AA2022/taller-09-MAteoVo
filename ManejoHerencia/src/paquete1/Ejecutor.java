/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String listado="",bene,c;
        int op=1,op2=1,i=1,nMeses;
        do {
            op=menu();
            switch(op){
                case 1:Persona per = person("Beneficiario");
                        System.out.println("Ingrese tiempo del prestamo (NUMERO DE MESES):");
                        nMeses = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese ciudad del prestamo:");
                        c= sc.nextLine();
                        System.out.println("Ingrese nivel de estudio:");
                        String nEstudio = sc.nextLine();
                        System.out.println("Ingrese nombre de la Institución Educativa:");
                        String nInstitucion = sc.nextLine();
                        System.out.println("Ingrese siglas de "+nInstitucion);
                        String sig = sc.nextLine();
                        System.out.println("Ingrese valor de la Carrera:");
                        double vc = sc.nextDouble();
                        InstitucionEducativa iE = new InstitucionEducativa(nInstitucion,sig);
                        PrestamoEducativo preEdu = new PrestamoEducativo(c,nEstudio,iE,vc,per,nMeses);
                        preEdu.setValorMensualPrestamo();
                        listado = String.format("%s\n(%d)PRESTAMO EDUCATIVO\n%s\n",listado,i,preEdu);
                        i++;
                        break;
                    case 2:Persona per2 = person("Beneficiario");
                        System.out.println("Ingrese tiempo del prestamo (NUMERO DE MESES):");
                        nMeses = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese ciudad del prestamo:");
                        c= sc.nextLine();
                        System.out.println("Ingrese tipo de Automovil:");
                        String tAuto = sc.nextLine();
                        System.out.println("Ingrese marca del Automovil:");
                        String mAuto = sc.nextLine();
                        Persona garante = person("Garante");
                        System.out.println("Ingrese valor del Automovil:");
                        double vAuto = sc.nextDouble();
                        PrestamoAutomovil preAuto = new PrestamoAutomovil(c,tAuto,mAuto,garante,vAuto,per2,nMeses);
                        preAuto.setValorMensualAutomovil();
                        listado = String.format("%s\n(%d)PRESTAMO AUTOMOVIL\n%s\n",listado,i,preAuto);
                        i++;
                        break;
                    default:
                        break;
            }
            op2 = menu2();
        } while (op2!=0);
        System.out.printf("%s\n",listado);
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar un PRESTAMO de que tipo??");
        System.out.println("EDUCATIVO                            [1]:");
        System.out.println("AUTOMOVIL                            [2]:");
        int op = sc.nextInt();
        return op;
    }
    public static int menu2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar otro PRESTAMO??");
        System.out.println("SI                            [1]:");
        System.out.println("NO                            [0]:");
        int op = sc.nextInt();
        return op;
    }
    public static Persona person(String tipe){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del "+tipe+": ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido del "+tipe+": ");
        String ape = sc.nextLine();
        System.out.println("Ingrese username del "+tipe+": ");
        String user = sc.nextLine();
        Persona per = new Persona(nombre,ape,user);
        return per;
    }
}
