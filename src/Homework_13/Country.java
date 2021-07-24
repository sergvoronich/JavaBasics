package Homework_13;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"name", "population", "languages", "area"})
public class Country implements Serializable {
    private String name;
    private static double area;
    private long population;
    private List<Language> languages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    @XmlElement(name = "country_population")
    public void setPopulation(long population) {
        this.population = population;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    @XmlElementWrapper(name = "official_languages")
    @XmlElement(name = "language")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", languages=" + languages +
                '}';
    }
}