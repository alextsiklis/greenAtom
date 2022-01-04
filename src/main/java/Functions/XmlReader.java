package Functions;

import entity.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.awt.*;
import java.io.File;

public class XmlReader {
    private static final String TEXT = "text";
    private static final String ID = "mathno";
    private static final String LANGUAGE = "langkey";

    public static Product xmlReader(String filename) {
        List products = new List();
        String path = "src/main/resources/" + filename + ".xml";
        File file = new File(path);

        Product product = null;
        try {
            JAXBContext context = JAXBContext.newInstance(product.getClass());
            Unmarshaller unMarshaller = context.createUnmarshaller();
            product = (Product) unMarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return product;
    }
}