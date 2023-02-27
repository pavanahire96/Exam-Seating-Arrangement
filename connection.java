/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_arrangement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
public class connection {
    private static String server_name="localhost",username="root",dbname="seating_arrangement",password="";
    private static int portnumber=3306;
    public static Connection getConnection(){
    Connection con=null;
    
    MysqlDataSource dataSource=new MysqlDataSource();
    
    dataSource.setServerName(server_name);
    dataSource.setUser(username);
    dataSource.setPassword(password);
    dataSource.setDatabaseName(dbname);
    dataSource.setPortNumber(portnumber);
    
    try{
    con=dataSource.getConnection();
    }catch(SQLException ex){
    java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return con;
    }
}
