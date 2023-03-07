package tacos.domain;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 February 2023
 */

@Data
@Table
public class IngredientRef {
    private String ingredient;
}
