
import java.sql.*;

public class Main {

	public static void main(String[] args) {

		
		
		String url = "jdbc:mysql://localhost:3306/empleadoss_departamentoss";
		
		try {
			
			
			//Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(url,"root","root");
			

			Statement instruccion = conexion.createStatement();
			
			String sql = "SELECT nDIEmp,nomEmp,fecNac,SalEmp FROM empleados";
			
			ResultSet resultados = instruccion.executeQuery(sql);
			
			while(resultados.next()) {
				
				System.out.print("Numero: " + resultados.getString("nDIEmp"));
				System.out.print(" Nombre: " + resultados.getString("nomEmp"));
				System.out.print(" fecNac: " + resultados.getString("fecNac"));
				System.out.print(" Salario: " + resultados.getString("SalEmp"));
				System.out.println();
			
					
			} 
			
			resultados.close();
			instruccion.close();
			conexion.close();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace(System.out);
			
		}
		
		
		
		
		
		
	}

}
