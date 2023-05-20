/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionClass {
    
    Connection cn;
    public Statement stm;
    public ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            stm=cn.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String s[])
    {
        new ConnectionClass();
    }
}
