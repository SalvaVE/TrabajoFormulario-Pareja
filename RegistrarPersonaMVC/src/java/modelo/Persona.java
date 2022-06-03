package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

        
public class Persona {
    
    String dui;
    String apellidos;
    String nombres;
    
    Connection cnn;
    Statement state;
    ResultSet result;
    
    public Persona() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_recurso_humano?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public Persona(String dui, String apellidos, String nombres) {
        this.dui = dui;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    
    
    public boolean insertarDatos(){
        try {
            String miQuery = "insert into tb_persona values('" + dui + "', '" + apellidos + "', '" + nombres + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Persona> consultarRegistros(){
        ArrayList<Persona> person = new ArrayList();
        
        try{
            String miQuery = "select * from tb_persona;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                
                person.add(new Persona(result.getString("dui_persona"), result.getString("apellido_persona"), result.getString("nombre_persona")));
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }
    
    public boolean EliminarRegistro (){
        try {
            String miQuery = "delete from tb_persona where dui_persona = ('" +dui+ "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 public boolean ModificarRegistro(){
        try {
            String miQuery = "update tb_persona set apellido_persona =('" +apellidos+ "'), nombre_persona = ('" +nombres+ "') where dui_persona = ('" + dui+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
}
