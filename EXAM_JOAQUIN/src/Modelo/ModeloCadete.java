package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloCadete {

	public ModeloCadete() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Cadete> load(){
		Conexion conexion = Conexion.getInstance();
		ResultSet rs = conexion.query("SELECT * FROM cadetes where id=4;");
		
		ArrayList<Cadete> usuarios = new ArrayList<Cadete>();
		try{
			while(rs.next()){
				Cadete cadete = new Cadete();
				cadete.setNombre((String) rs.getObject("nombre"));
				cadete.setApellidos((String) rs.getObject("apellidos"));
				cadete.setNacionalidad((String) rs.getObject("nacionalidad"));
				cadete.setId((int) rs.getObject("id"));
				cadete.setEdad((int) rs.getObject("edad"));
				usuarios.add(cadete);
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD USUARIO");
		}
		return usuarios;
	}
	
	public void save(Cadete cadete){
		
	}
	
	/*public ArrayList<Cadete> loadComboBox(){
		Conexion conexion = Conexion.getInstance();
		ResultSet rs = conexion.query("SELECT * FROM cadetes where equipo=4;");
		
		ArrayList<Cadete> usuarios = new ArrayList<Cadete>();
		try{
			while(rs.next()){
				Cadete cadete = new Cadete();
				cadete.setNombre((String) rs.getObject("nombre"));
				cadete.setApellidos((String) rs.getObject("apellidos"));
				cadete.setNacionalidad((String) rs.getObject("nacionalidad"));
				cadete.setId((int) rs.getObject("id"));
				cadete.setEdad((int) rs.getObject("edad"));
				cadete.setEquipo((int) rs.getObject("equipos"));
				usuarios.add(cadete);
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD USUARIO");
		}
		return usuarios;

	}*/
}