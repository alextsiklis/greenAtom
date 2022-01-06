import Functions.PackageCreator;
import Functions.Transformer;
import Functions.XmlReader;
import Functions.XmlWriter;

public class Main {
    public static void main(String[] args) {
        PackageCreator.createPackage("ResultedXML");

        XmlWriter.xmlWriter(Transformer.transform(XmlReader.xmlReader("firstXML")));
    }
}