/*package recursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBD {
	public static void main(String[] args) import java.sql.SQLException;{
		//Conectar
		String strConexaoMySQL = "jdbc:mysql://ip_da_maquina_do_bd:5432/nomedobanco";
		Connection conexao = DriverManager.getConnection(strConexaoMySQL, "usuario", "senha");
		//Executar
		PreparedStatement sql = conexao.prepareStatement("SELECT numero, tenis, coberta FROM quadras");
		ResultSet resultado = sql.executeQuery();
		while(resultado.next()) {
			System.out.printf("%d : %s (%s)", resultado.getInt("numero"), resultado.getBoolean("tenis") ? "Quadra de t�nis" : "Quadra de beach t�nis", resultado.getBoolean("coberta") ? "coberta" : "descoberta");
		}
		//Fechar conex�o
		System.out.println("Conex�o Criada");
		conexao.close();
	}

}
*/