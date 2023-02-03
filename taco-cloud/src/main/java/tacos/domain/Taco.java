package tacos.domain;

import lombok.Data;

import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
