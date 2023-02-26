package tacos.repository;

import tacos.domain.Ingredient;

import java.util.Optional;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 February 2023
 */

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
