package Functions;

import entity.Item;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class XmlWriter {

    public static void xmlWriter(Item item) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(item.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File requestFile = new File("ResultedXML" + new Date().getTime() + ".xml");
            marshaller.marshal(item, requestFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
