package Functions;

import entity.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.awt.*;
import java.io.File;

public class XmlReader {

    public static Product xmlReader(String filename) {
        String path = "src/main/resources/" + filename + ".xml";
        File file = new File(path);

        Product product = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Product.class);
            Unmarshaller unMarshaller = context.createUnmarshaller();
            product = (Product) unMarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(product);
        return product;
    }
}