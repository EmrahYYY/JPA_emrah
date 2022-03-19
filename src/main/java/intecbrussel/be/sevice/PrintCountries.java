package intecbrussel.be.sevice;

import intecbrussel.be.model.Countries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PrintCountries {
    public static void printCountries(EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Countries> cq = cb.createQuery(Countries.class);

        Root<Countries> from = cq.from(Countries.class);

        cq.select(from);

        TypedQuery<Countries> query = em.createQuery(cq);
        List<Countries> ct = query.getResultList();

        ct.forEach(System.out::println);
    }
}
