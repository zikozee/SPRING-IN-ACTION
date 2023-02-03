package tacos.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}
