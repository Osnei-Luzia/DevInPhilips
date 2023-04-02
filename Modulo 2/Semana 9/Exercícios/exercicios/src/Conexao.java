import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    String user = "sys as sysdba";
    String password = "admin";
    String url = "jdbc:oracle:thin:@localhost:1521/DEVINPHILIPS";

    Statement statement;

    public void conectar(){
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            String teste = "teste";
            this.statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO exercicioUm (texto) VALUES ('"+teste+"')");
            connection.commit();
            statement.close();
        }  catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
