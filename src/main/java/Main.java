import Functions.PackageCreator;
import Functions.Transformer;
import Functions.XmlReader;
import Functions.XmlWriter;
import entity.Item;
import entity.Product;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PackageCreator.createPackage("ResultedXML");

        Product product = new Product("4711","Карандаш", "Pencil", "Deafkdsmgkjsd");
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);

        Item item = new Item("411", "Карандаш");

        XmlWriter.xmlWriter(item);
        XmlReader.xmlReader("firstXML");

        System.out.println(Transformer.transform(products));
    }
}