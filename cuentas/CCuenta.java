package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número de cuenta bancaria. */
    private String cuenta;

    /** Saldo disponible en la cuenta. */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInteres;

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta bancaria.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo para la cuenta.
     * @param saldo Nuevo saldo a establecer (debe ser mayor o igual a 0).
     */
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece un nuevo tipo de interés para la cuenta.
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar (debe ser positiva).
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta si hay saldo suficiente.
     * @param cantidad Cantidad a retirar (debe ser positiva y menor o igual al saldo).
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}
