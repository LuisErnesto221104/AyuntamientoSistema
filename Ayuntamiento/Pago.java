package ayuntamiento;



import java.io.*;
import java.util.*;

/**
 * @author Les
 */
public class Pago {

    /**
     * Default constructor
     */
    public Pago() {
    }

    /**
     * //Primary Key
     */
    private int idPago;

    /**
     * 
     */
    private int monto;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    private Date fecha;

    /**
     * //FK
     */
    private int  idProcesamiento;

    /**
     * 
     */
    private int numTarjetaCredito;

    /**
     * 
     */
    public void procedimientoPago() {
        // TODO implement here
    }

    /**
     * 
     */
    public void generarRecibo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void liberarTramite() {
        // TODO implement here
    }

}