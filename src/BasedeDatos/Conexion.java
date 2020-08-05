
package BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
private static Connection con=null;

public static Connection Conectar(){
     
     
    if(con==null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Obligatorio2018","root","root");
            System.out.println("coneccion exitosa");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    return con;
}


public static void cerrarConeccion()throws SQLException{
    if(con!=null)
    {
        con.close();
    }
}

}