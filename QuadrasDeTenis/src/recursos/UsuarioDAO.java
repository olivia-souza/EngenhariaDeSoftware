/*package recursos;
import aplicacoes.NivelPermissao;
//import aplicacoes.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class UsuarioDAO {
	private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String senha;
    NivelPermissao nivel_permissao;
    LocalDate data_criacao;
    boolean desabilitado;
    boolean bloqueado;
    
    public UsuarioDAO(){ 
        this.connection = new ConexaoBD().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(nome,cpf,email,senha,nivel_permissao,data_criacao,desabilitado,bloqueado) VALUES(?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setNivelPermissao(5, usuario.getNivel_permissao());
            stmt.setLocalDate(6, usuario.getData_criacao());
            stmt.setboolean(7, usuario.getBloqueado());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
}*/