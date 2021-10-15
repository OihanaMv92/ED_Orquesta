package es.studium.afinacion;

public class musico
{
	/* atributos  */
	private String nombre;
	private char sexo;
	/* constructores */

	//constructores por defecto
	
	public musico() {
		nombre = " ";
		sexo = ' ';

	}
	
	//constructor con parametros
	
	public musico (String n, char a) {
		nombre =n;
		sexo = a;

		
		}

	/**
	 * @return the nombre
	 */
	public String getnombre()
	{
		return nombre;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo()
	{
		return sexo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setnombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}

	
	
}
