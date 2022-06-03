package modelo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IProducto {
    
    private static class current_timestamp {

        public current_timestamp() {
            String dateTime  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            System.out.println(dateTime);
        }
    }

    int idP;
    String nombreP;
    String desProducto;
   double stock;
    double precio;
    String unidadDeMedida;
    int estadoP;
    int categoria;
    current_timestamp date;

    Connection cnn;
    Statement state;
    ResultSet result;

    public IProducto() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public IProducto(int id, String nombre, String desProducto, float stock, float precio, String unidadDeMedida, int estadoP, int categoria,current_timestamp date ) {
        this.idP = id;
        this.nombreP = nombre;
        this.desProducto = desProducto;
        this.stock = stock;
        this.precio = precio;
        this.unidadDeMedida = unidadDeMedida;
        this.estadoP = estadoP;
        this.categoria = categoria;
        this.date = date;
        
    }

    

    public boolean insertarDatosP() {
        try {
            String miQuery = "insert tb_producto values('" + idP + "', '" + nombreP + "', '" + desProducto + "', '" + stock + "', '" + precio + "', '" + unidadDeMedida + "', '" + estadoP + "', '" + categoria + "', '" + date + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
         Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public int getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(int estadoP) {
        this.estadoP = estadoP;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public current_timestamp getDate() {
        return date;
    }

    public void setDate(current_timestamp date) {
        this.date = date;
    }



}
