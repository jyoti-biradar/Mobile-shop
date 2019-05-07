/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ritesh
 */
import java.sql.*;   
public class DataBaseConnection {
    public  Connection getConnection(){
        Connection c=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/mobile_shop" ,"root","");
            System.out.print("Database is connected !");
            
        }catch(SQLException e){
            System.out.println("Table is created error 1 !!!!  "+e);
        }catch(ClassNotFoundException e){
            System.out.println("Table is created error 2 !!!!  "+e);
        }
        return  c;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
