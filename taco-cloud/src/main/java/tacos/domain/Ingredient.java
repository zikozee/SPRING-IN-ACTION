package tacos.domain;

import lombok.Data;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
