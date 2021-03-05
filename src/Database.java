/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chelcy Millenika
 */
import java.sql.*;
public class Database {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("yes");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/news","root","mockingjay");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user");
            while(rs.next())
                System.out.println(rs.getInt(1));
                     con.close();
    }
        catch(Exception e)
                {   
                }
    
}
}
