package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

import static entity.Languages.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlElement(name = "MATNO")
    private String Id;

    @XmlElement(name = "TEXT")
    private String RuName;

    @XmlElement(name = "TEXT")
    private String EnName;

    @XmlElement(name = "TEXT")
    private String DeName;

    public static HashMap mapping(Product product) {
        HashMap<Languages, String> map = new HashMap<Languages, String>();
        map.put(RU, product.getRuName());
        map.put(EN, product.getEnName());
        map.put(DE, product.getDeName());
        return map;
    }
}
