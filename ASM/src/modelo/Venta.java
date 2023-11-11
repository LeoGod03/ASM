
package modelo;

import java.util.Date;


public final class Venta {
    // atributos de la clase
    private String id;
    private Date fecha;
    private double totalVenta;
    
    // constructor para las busquedas y eliminaciones
    public Venta(String id){
        setId(id);
        setFecha(null);
        setTotalVenta(0);
        
    }
    // este constructor es especial para los registros en la base de datos
    public Venta(String id, Date fecha, double totalVenta){
       setId(id);
       setFecha(fecha);
       setTotalVenta(totalVenta);
    }

   // metodos get y set de la clase
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public Date getFecha() {
        return fecha;
    }

    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    public double getTotalVenta() {
        return totalVenta;
    }

    // metodo set especial para la venta por si el sistema falla, no sea numero negativo
    public void setTotalVenta(double totalVenta) {
        if(totalVenta > 0)
            this.totalVenta = totalVenta;
        else
            this.totalVenta = 1;
    }
}
