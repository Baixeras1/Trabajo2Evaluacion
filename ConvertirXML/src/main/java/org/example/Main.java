package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JAXBException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Sucursales.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Sucursales sucursales = (Sucursales) unmarshaller.unmarshal(new File("sucursales.xml"));

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(sucursales, stringWriter);
            System.out.println(stringWriter.toString());

            ObjectMapper mapper = new ObjectMapper();

            try {
                String jsonData = mapper.writeValueAsString(sucursales);

                try {
                    mapper.writeValue(new File("sucursales.json"), sucursales);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }


        }catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}