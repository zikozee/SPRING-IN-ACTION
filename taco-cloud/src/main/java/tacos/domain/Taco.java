package tacos.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */

@Data
public class Taco {

    private Long id;

    @NotBlank
    @Size(min = 5, message = "Name must be at least 5 Characters long")
    private String name;

    @PastOrPresent(message = "taco cannot be in the future")
    private Date createdAt;
    @NotNull
    @Size(min = 1, message = "you must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;

    public void addIngredient(Ingredient taco) {
        this.ingredients.add(new IngredientRef(taco.getId()));
    }
}
