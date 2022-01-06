package Functions;

import entity.Item;
import entity.Product;

import java.util.Objects;

public class Transformer {
    public static Item transform(Product product){
        Item item = new Item();
        item.setId(product.getId());
//        item.setDescription(product.getMapElements().getValue());

        for(int i=0; i < product.getLangNames().size(); i++) {
            if (Objects.equals(product.getLangNames().get(i).getLang(), "RU")) {
                item.setDescription(product.getLangNames().get(i).getName());
            }
        }

        LogCreator.logCreator("Информация обработана");
        return item;
    }

}
