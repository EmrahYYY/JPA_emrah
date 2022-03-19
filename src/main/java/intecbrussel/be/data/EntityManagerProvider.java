package intecbrussel.be.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {


 private static    EntityManagerFactory emf = Persistence.createEntityManagerFactory("emrah-source");


    public static EntityManager getEntityManagerProvider() {


     return    emf.createEntityManager();
  }




}
