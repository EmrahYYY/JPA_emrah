package intecbrussel.be.model;


import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Countries {
    @Id
    @GeneratedValue
   private int Id;

  private String name, capitalCity;

  private LocalDate date;

  private LocalTime time;

  @OneToMany( mappedBy = "countries", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  private List<Cities> cities;


    public Countries() {

    }

    public Countries(int id) {
        Id = id;
    }

    public Countries(int id, String name, String capitalCity, LocalDate date, LocalTime time) {
        Id = id;
        this.name = name;
        this.capitalCity = capitalCity;
        this.date = date;
        this.time = time;
    }

    public Countries( String name, String capitalCity, LocalDate date, LocalTime time, List<Cities> cities) {
        this.name = name;
        this.capitalCity = capitalCity;
        this.date = date;
        this.time = time;
        this.cities = cities;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Cities> getCities() {
        return cities;
    }

    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", cities=" + cities +
                '}';
    }
}
