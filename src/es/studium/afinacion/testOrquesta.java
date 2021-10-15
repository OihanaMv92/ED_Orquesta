package es.studium.afinacion;


public class testOrquesta
{

	public static void main(String[] args)
	{
		instrumento i1 = new instrumento("trompeta", 'b');
		
		musico m1= new musico("Lucas",'h');
		
		String mensaje = "hola, me llamo " + m1.getnombre() + " y toco el " + i1.getInstrumento();
		System.out.println(mensaje);
		
		i1.setInstrumento("trompeta");
		i1.setAfinacion('a');
		m1.setnombre("Manolo");
		m1.setSexo('m');
		
		String mensaje1 = "hola, me llamo " + m1.getnombre() + " y toco el " + i1.getInstrumento();
		System.out.println(mensaje1);

	}

}
