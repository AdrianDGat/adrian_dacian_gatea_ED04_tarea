package cuentas;

/**
 * Clase principal que contiene el método main para realizar operaciones en una cuenta bancaria.
 * 
 * @author adrian
 */
public class Main {

    /**
     *
     * @param args 
     *
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad = 0f;
        operativa_cuenta(cantidad);
    }
     /**
     * Realiza operaciones en una cuenta bancaria de ejemplo.
     * 
     * @param cantidad La cantidad a utilizar en las operaciones.
     */
    static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
