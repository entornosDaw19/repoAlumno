import java.util.*;

//Prueba de la clase AlumnoG desde github
public class AppAlumnoG
{
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    
        String cad;
	//int edad;
	int n[]=new int[3];
	
        AlumnoG al=new AlumnoG(); 
	System.out.println("Introduce el nombre:");
	cad=teclado.nextLine();
        al.setNombre(cad);	
	System.out.println("Introduce el telefono:");
	cad=teclado.nextLine();
        al.setTelefono(cad);
	
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

