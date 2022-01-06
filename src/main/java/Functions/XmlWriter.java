package Functions;

import entity.Item;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

//Создает XMl файл и записывает в него информацию об объекте
public class XmlWriter {

    public static void xmlWriter(Item item) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Item.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            Date date = new Date();
            File requestFile = new File(String.format("ResultedXML/%tF.xml", date));
            marshaller.marshal(item, requestFile);
            LogCreator.logCreator("Информация записана в файл");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
