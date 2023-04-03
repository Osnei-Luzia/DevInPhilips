
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    public static void main (String[] args) {
        ExercicioTres teste = new ExercicioTres();

        teste.setTexto("Foi");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DEVINPHILIPS");
        EntityManager en = factory.createEntityManager();

        en.getTransaction().begin();
        en.persist(teste);
        en.getTransaction().commit();
        en.close();
    }
}
