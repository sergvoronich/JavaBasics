package Homework_13;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

public class Language implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language(String name) {
        this.name = name;
    }

    public Language() {}

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                '}';
    }

}