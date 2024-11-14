/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver"; //Decía "com.mysql.jdbc.Driver" pero daba un error.
    
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }    
    }
    
    protected void desconectarBase() throws Exception {  //Después de las consultas hay que desconectarse de la BD. Mato
    //las consultas. Tengo que cortar la conexión porque si no, quedan conexiones en espera sin hacer nada.
        try {
            if (resultado != null) {  //Si se cumple, es que está albergando algún resultado de consulta.
                resultado.close(); //Lo cierro. No quiero que queden resultados residuales de consultas anteriores.
            }
            if (sentencia != null) {  //Si se cumple, es que hay una instrucción a ejecutar en la BD.
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception {
    //Método que impacta a la BD. String sql tiene la consulta a ejecutar. El String puede tener cualquier nombre.
        try {
            conectarBase(); //Cada vez que hago una consulta me conecto, hago lo que necesito y me desconecto.
            sentencia = conexion.createStatement(); //Prepara la variable sentencia para crear una sentencia.
            sentencia.executeUpdate(sql); //Llega una Query (sql) y la ejecuto.
        } catch (ClassNotFoundException | SQLException ex) { //Son los tipos de errores que puede lanzar conectarBase.
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase(); //Se conecta a la BD.
            sentencia = conexion.createStatement(); //Prepara la sentencia.
            resultado = sentencia.executeQuery(sql); //Guarda los resultados de la consulta.
        } catch (Exception ex) {
            throw ex;
        } //El desconectarBase se pone en otro lado.
    }
    
}
