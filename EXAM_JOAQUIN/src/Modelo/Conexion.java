package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	private Connection conexion;
	// DATOS DE LA CONEXION
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS POR DEFECTO
	private static final String HOST="localhost";
	private static final String BBDD="thelaby";
	private static final String USER="root";
	private static final String PASS="";
	
	private static Conexion instance=null;
	

	private Conexion(){
		try {
			Class.forName(CONTROLADOR_MYSQL).newInstance();
			System.out.println("CARGA CORRECTA DEL CONTROLADOR JDBC");
		} 
		catch (Exception errorCargaControlador) {
			// TODO Auto-generated catch block
			errorCargaControlador.printStackTrace();
			System.out.println("ERROR EN LA CARGA DEL CONTROLADOR");
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD+"?"+"user="+USER+"&password="+PASS);
			System.out.println("CONEXION REALIZADA CON EXITO");
		} 
		catch (SQLException errorConexionBBDD) {
			// TODO Auto-generated catch block
			errorConexionBBDD.printStackTrace();
			System.out.println("ERROR DE CONEXION CON LA BBDD");
		}
	}
	
	public static Conexion getInstance() {
		if(instance==null) {
			instance=new Conexion();
		}
		return instance;
	}
		

		//Gracias a este método realizaríamos los selects
	public ResultSet query(String query){
		
		Statement st;
		ResultSet rs = null;

		try {
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		
		}
		catch (SQLException e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return rs;	
										
	}
	
	//Aqui realizamos los posibles Inserts, Deletes o Updates;
	public int modifyQuery(String update){
		Statement stmt;
		int rs = 0;
		try{
		stmt = conexion.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}
			catch (SQLException e){
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
}