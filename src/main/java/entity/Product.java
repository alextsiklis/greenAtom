package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "Material", namespace = "urn:test.ru")
@XmlAccessorType(XmlAccessType.FIELD)
//Обрабатыввемый объект из начального файла XML
public class Product {
    @XmlElement(name = "MATNO")
    private int Id;

//    @XmlElement(name = "MATTEXT")
//    @XmlJavaTypeAdapter(MapAdapter.class)
//    private MapElements mapElements;

    @XmlElement(name = "MATTEXT")
    private List<LangName> langNames = new ArrayList<>();
}
