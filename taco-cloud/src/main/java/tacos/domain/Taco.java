package tacos.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 February 2023
 */

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, message = "Name must be at least 5 Characters long")
    private String name;

    @PastOrPresent(message = "taco cannot be in the future")
    private Date createdAt;
    @NotNull
    @Size(min = 1, message = "you must choose at least 1 ingredient")
    @ManyToMany
    @ToString.Exclude
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient taco) {
        this.ingredients.add(taco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Taco taco = (Taco) o;
        return getId() != null && Objects.equals(getId(), taco.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
