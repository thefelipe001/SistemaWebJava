
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ClienteDao {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Cliente buscar(String dni)
    {
    Cliente c= new Cliente();
    String sql="Select * from cliente where Dni="+dni;
    try
    {
        con=cn.Conexion();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next())
        {
        c.setId(rs.getInt(1));
        c.setDni(rs.getString(2));
        c.setNom(rs.getString(3));
        c.setDir(rs.getString(4));
        c.setES(rs.getString(5));
        
        }
    
    }catch(Exception e){}
    return c;
    }
    
}
