import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table (name = "exerciciosTres") definir o nome da tabela que será espelhada
public class ExercicioTres {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) o sql developer já possui ID gerado.
    private int id;
    //@Column(name = "nomeNoDB")
    String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
