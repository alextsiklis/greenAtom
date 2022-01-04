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

        ArrayList<Product> products = new ArrayList<>();

        products.add(XmlReader.xmlReader("firstXML"));

        Transformer.transform(products);

        Item item = new Item("411", "Карандаш");

        XmlWriter.xmlWriter(item);
    }
}