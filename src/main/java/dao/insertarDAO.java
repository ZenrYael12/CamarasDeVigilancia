package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.camaraDatos;

public class insertarDAO {

	conexionBD con = new conexionBD();
	
	public void insertar(camaraDatos datos) {
		Connection conexion = con.conectar(); 
		PreparedStatement pst;
		String sql = "insert into camaras_datos values(?,?,?)";
		try {
			pst = conexion.prepareStatement(sql);
			pst.setString(1, datos.getFecha());
			pst.setString(2, datos.getMatricula());
			pst.setString(3, datos.getFoto());
			pst.executeUpdate();
			pst.close();
			conexion.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public ArrayList<camaraDatos> buscar(){
		Connection conexion = con.conectar(); 
		String sql = "select * from camaras_datos";
		ResultSet rs = null;
		camaraDatos datos = null;
		ArrayList<camaraDatos> ingresar = new ArrayList<camaraDatos>(); 
		
		PreparedStatement pst;
		try {
			pst = conexion.prepareStatement(sql);
			rs = pst.executeQuery(); 
			while(rs.next()) {
				datos = new camaraDatos(rs.getString("fecha"), rs.getString("matricula"), 
						rs.getString("foto"));
				ingresar.add(datos);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ingresar;
	}
	
	
}
