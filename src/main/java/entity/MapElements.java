package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MATTEXT", propOrder = {
        "key",
        "value"
})

//Нужен, если рассматривать Map в объекте
public class MapElements {
    @XmlElement(name = "LANGKEY")
    public String key;

    @XmlElement(name = "TEXT")
    public String value;

}
