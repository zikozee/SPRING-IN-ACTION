package tacos.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.domain.Ingredient;
import tacos.domain.Ingredient.Type;
import tacos.repository.IngredientRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */


@Component
@RequiredArgsConstructor
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository repository;

    @Override
    public Ingredient convert(String id) {
        return repository.findById(id).orElse(null);
    }

}