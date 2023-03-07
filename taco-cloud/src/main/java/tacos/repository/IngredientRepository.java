package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.domain.Ingredient;

import java.util.Optional;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 February 2023
 */

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
