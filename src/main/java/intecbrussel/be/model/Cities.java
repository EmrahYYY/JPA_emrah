package intecbrussel.be.model;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class Cities {

    @Id
    @GeneratedValue
   private int Id;

    @Column(name = "city")
    private String cities;

    @ManyToOne( fetch = FetchType.LAZY)
    private Countries countries;

    public Cities() {
    }

    public Cities(String cities) {
        this.cities = cities;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "Id=" + Id +
                ", cities='" + cities + '\'' +
                '}';
    }
}
