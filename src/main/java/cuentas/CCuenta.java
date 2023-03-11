
package cuentas;

/**La clase CCuenta, hace algunas de las operaciones típicas 
 * que se pueden hacer con una cuenta bancaria.
 * 
 * @author Adán Fernández Blanco
 * 
 * Podemos seguir el proyecto en el repositorio online de Github
 * @see https://github.com/Blancofdez/Deposito.git
 * 
 * 
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /** Este es uno de los constructores de la clase CCuentas 
     * el cual tiene nos siguientes parámetros.
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     * 
     * 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

   /** El método getNombre
    * 
    * @return Devuelve el nombre del cliente de la cuenta
    */
    
    public String getNombre() {
        return nombre;
    }
    
     /** El método getCuenta
    * 
    * @return Devuelve el núemro de cuenta del cliente
    */

    public String getCuenta() {
        return cuenta;
    }
    
     /** El método getSaldo
    * 
    * @return Devuelve el saldo actual del cliente
    */

    public double getSaldo() {
        return saldo;
    }
    
     /** El método getTipoInterés
    * 
    * @return Devuelve el tipo de interés que tiene la cuenta
    */

    public double getTipoInterés() {
        return tipoInterés;
    }
    
     /** El método setNombre
      * 
      * @param nombre 
      */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     /** El método setCuenta
      * 
      * @param cuenta 
      */
 

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
     /** El método setSaldo
      * 
      * @param saldo 
      */
  
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     /** El método setTipoInterés
      * 
      * @param tipoInterés 
      */


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /** El metodo estado.
     * 
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return saldo actual de la cuenta
     * 
     */
   
    
    public double estado()
    {
        return saldo;
    }
    
     /** El metodo ingresar
      * 
      * Hace un ingreso en la cuenta que le indiquemos, recibiendo como 
      * parámetro la cantidad que queremos ingresar.
      * 
      * @param cantidad
      * @throws Exception 
      */
    

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

       /** El metodo retirar
        * 
        * Realiza una retirada en cuenta
        * 
        * @param cantidad
        * @throws Exception 
        */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
