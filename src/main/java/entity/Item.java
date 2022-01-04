package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "ProductDefinition")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    @XmlElement(name = "RefNo")
    private String Id;
    @XmlElement(name = "Description")
    private String Description;
}