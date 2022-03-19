package intecbrussel.be;

import intecbrussel.be.data.CountriesRepository;
import intecbrussel.be.data.EntityManagerProvider;
import intecbrussel.be.model.Cities;
import intecbrussel.be.model.Countries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManager em = EntityManagerProvider.getEntityManagerProvider();

        Countries countries = new Countries();
        countries.setName("f");
        Cities cities = new Cities();
        cities.setCities("jfksbjksdbj");
     //   Cities cities1 = new Cities("Lassi");
//        List<Cities> t= new ArrayList<>();
//        t.add(cities);
//        t.add(cities1);
     //  Countries countries = new Countries("Lebanon", "Beirut", LocalDate.now(), LocalTime.now(),t);



    //  cities1.setCountries(countries);
       cities.setCountries(countries);

//        Countries countries = new Countries();
//        countries.setName("f");
//        Cities cities = new Cities();
//        cities.setCities("f");


  //    em.persist(cities);
    //  em.persist(cities1);
        em.persist(countries);

        em.getTransaction().begin();
        em.getTransaction().commit();


        //   CountriesRepository.add(countries);

        // CountriesRepository.update(countries);

        //  CountriesRepository.delete(countries,9);


//        Countries countries1 = em.find(Countries.class,2);
//        em.remove(countries1);

        //     em.getTransaction().begin();
        //   em.getTransaction().commit();


    }


}
