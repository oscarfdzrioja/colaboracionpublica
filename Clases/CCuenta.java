package cuentas;

/**
 * Clase que simula la logica de crear y usar la tipica cuenta en un
 * Banco.
 * @author oscar
 * @version 1.0
 * @see
 *
 */


public class CCuenta {

	/**
	 * Devuelve el valor del atributo nombre de la clase 
	 * @return nombre del propietario de la cuenta.
	 */
	
    public String getNombre() {
		return nombre;
	}
    
    /**
     * Establece el valor del atributo nombre de la clase
     * @param nombre  que sera un String con el valor 
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el valor del atributo cuenta de la clase
	 * @return cuenta que sera el String que contiene el numero CC
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Establace el valor para el parametro cuenta de la clase
	 * @param cuenta  que es un String con el numero de  CC
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	

	private String nombre;  //Guarda el nombre
    private String cuenta;  //Guarda el numero de CC
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    
    /**
     * 
     * @param nom String que contiene el valor del nombre
     * @param cue String que contiene el valor del CC
     * @param sal Double que contiene el valor del saldo
     * @param tipo Double que contiene el valor del Interes
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
