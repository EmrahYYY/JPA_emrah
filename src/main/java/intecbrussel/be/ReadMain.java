package intecbrussel.be;

import intecbrussel.be.data.EntityManagerProvider;
import intecbrussel.be.model.Countries;
import intecbrussel.be.sevice.PrintCountries;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReadMain {
    public static void main(String[] args) {
        EntityManager em= EntityManagerProvider.getEntityManagerProvider();


        PrintCountries.printCountries(em);

}}
