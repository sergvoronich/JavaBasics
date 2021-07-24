package Homework_13;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Country Belarus = new Country();
        Belarus.setName("Беларусь");
        Belarus.setPopulation(9500000);
        Belarus.setArea(5000000.9);

        List<Language> languages = new ArrayList<>();
        languages.add(new Language("Russian"));
        languages.add(new Language("Belarussian"));
        Belarus.setLanguages(languages);


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File xmlFile = new File("test.xml");

            marshaller.marshal(Belarus, xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            JAXBContext jaxbContextNew = JAXBContext.newInstance(Country.class);
            Unmarshaller unmarshaller = jaxbContextNew.createUnmarshaller();

            File xmlFile = new File("test.xml");

            Country newCountry = (Country) unmarshaller.unmarshal(xmlFile);
            System.out.println(newCountry);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
