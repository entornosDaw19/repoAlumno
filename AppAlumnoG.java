//package Practica_II;

import java.util.*;

public class AppAlumnoG
{
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    
        String cad;
	int n[]=new int[3];
	
        AlumnoG al=new AlumnoG(); 
        al.setNombre("Jose");
        al.setEdad(21);
        al.setTelefono("777654321");
	for (int i=0;i<n.length;i++)
		{
			n[i]=(int)(Math.random()*10);
		}
	al.setNotas(n);
        al.vis();
              System.out.println("Los datos del alumno son");
        System.out.println(al.toString());
    }
}
