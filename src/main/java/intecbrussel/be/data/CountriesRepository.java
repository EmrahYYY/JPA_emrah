package intecbrussel.be.data;

import intecbrussel.be.model.Countries;

import javax.persistence.EntityManager;

public class CountriesRepository {

    public static Countries add(Countries countries){

        EntityManager em= EntityManagerProvider.getEntityManagerProvider();
        em.persist(countries);
        em.getTransaction().begin();
        em.getTransaction().commit();


 return countries;   }


    public static Countries update(Countries countries){


        EntityManager em= EntityManagerProvider.getEntityManagerProvider();
        em.merge(countries);
        em.getTransaction().begin();
        em.getTransaction().commit();


        return countries;

    }

    public static Countries delete(Countries countries, int id){


        EntityManager em= EntityManagerProvider.getEntityManagerProvider();
         countries=    em.find(Countries.class,id);
        em.remove(countries);
        em.getTransaction().begin();
        em.getTransaction().commit();


//        em.remove(countries1);
        return countries;

    }
}
