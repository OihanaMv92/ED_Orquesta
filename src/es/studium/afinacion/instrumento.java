package es.studium.afinacion;

public class instrumento
{
	/* atributos  */
	private String instrumento;
	private char afinacion;
	/* constructores */

	//constructores por defecto
	
	public instrumento() {
		instrumento = " ";
		afinacion = ' ';

	}
	
	//constructor con parametros
	
	public instrumento (String n, char a) {
		instrumento =n;
		afinacion = a;

		
		}

	/**
	 * @return the instrumento
	 */
	public String getInstrumento()
	{
		return instrumento;
	}

	/**
	 * @return the afinacion
	 */
	public char getAfinacion()
	{
		return afinacion;
	}

	/**
	 * @param instrumento the instrumento to set
	 */
	public void setInstrumento(String instrumento)
	{
		this.instrumento = instrumento;
	}

	/**
	 * @param afinacion the afinacion to set
	 */
	public void setAfinacion(char afinacion)
	{
		this.afinacion = afinacion;
	}

	
}
