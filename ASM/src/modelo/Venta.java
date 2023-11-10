
package modelo;

import java.util.Date;

public final class Venta {
    private String id;
    private java.sql.Date fecha;
    private double totalVenta;
    
    
    public Venta(String id){
        this.id = id;
    }
    
    public Venta(String id, java.sql.Date fecha, double totalVenta){
        this.id = id;
        this.fecha = fecha;
        setTotalVenta(totalVenta);
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public java.sql.Date getFecha() {
        return fecha;
    }

    
    public void setFecha(java.sql.Date fecha) {
        this.fecha = fecha;
    }

    
    public double getTotalVenta() {
        return totalVenta;
    }

    
    public void setTotalVenta(double totalVenta) {
        if(totalVenta > 0)
            this.totalVenta = totalVenta;
        else
            this.totalVenta = 1;
    }
}
