
package com.ajustement.stock;
import java.sql.*;

public class Connexion {
    Connection con;
    @SuppressWarnings("empty-statement")
	public Connexion(){

	try{
	Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e){
	System.err.println(e);
        }
        
	try{
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajustement","root","");
        }catch(SQLException e){
	System.err.println(e);
        }
    }
        Connection Obtenirconnexion(){return con;}

    Statement prepareStatement(String requete_connect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Statement createStatement(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
