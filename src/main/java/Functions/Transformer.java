package Functions;

import entity.Item;
import entity.Languages;
import entity.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import static entity.Languages.*;

public class Transformer {
    public static ArrayList<Item> transform(ArrayList<Product> products){
        ArrayList<Item> items = new ArrayList<>();


        for(Product product: products){
            Item item = new Item();
            item.setId(product.getId());
            item.setDescription(product.getRuName());
            items.add(item);
        }

        return items;
    }

}