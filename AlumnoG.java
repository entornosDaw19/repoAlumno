public class AlumnoG
{
	private String nombre;
	private String telefono;
	private int notas[];
	private float media;
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nomb)
	{
		nombre = nomb;
	}
	
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(String tel) 
	{
		telefono = tel;
	}
	
	public int[] getNotas() 
	{
		return notas;
	}
	
	public void setNotas(int notas[]) 
	{
		this.notas = notas;
	}
	public float getMedia() 
	{
	float s=0;
	for (int i=0;i<notas.length;i++)
	{
			s=s+notas[i];
	}
	return s/notas.length;
	}
	
	public void vis()
	{
		System.out.println("Nombre: "+ nombre+" Telefono: "+telefono);
		System.out.println("Las notas son ");
		for (int i=0;i<notas.length;i++)
		{
			System.out.print(notas[i]+" ");
		}
		System.out.println(" ");
	}
	public String toString ()
	{
	String cadena="",subcadena="";
		cadena="nombre= "+nombre+" Telefono "+telefono+" notas: ";
		for (int i=0;i<notas.length;i++)
		{
			subcadena+=notas[i]+" ";
		}
		
	return cadena+subcadena;		
	}
}
	
	


