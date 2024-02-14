package cuentas;


 


/**
 * 
 * @author adrian
 * La clase CCuenta representa una cuenta bancaria.ç
 * 
 * Tienen la informacion: el nombre del titular ,el número de cuenta, el saldo y el tipo de interés.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    
    // getters y setters
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     *
     */
    public CCuenta() {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    //metodo que devuelve el saldo

    /**
     *
     * @return
     */
    public double estado() {
        return getSaldo();
    }
    
    
    
    
//metodo para ingresar cantidad en cuenta
    
      /**
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    
    
    
    
    
    
//metodo para retirar cantidad de la cuenta
    
    
    
    
     /**
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        
        //condicion : si cantidad es menor o igual a 0 muestra exception con mensaje
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
         //condicion: si estado es menor a cantidad , muestra mensaje       
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        //si no se cumple ninguna condicion anterior al saldo se le resta la cantidad .
        setSaldo(getSaldo() - cantidad);
    }
}
