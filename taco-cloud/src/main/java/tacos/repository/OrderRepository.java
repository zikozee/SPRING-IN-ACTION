package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.domain.TacoOrder;

import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 February 2023
 */

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> readByDeliveryZip(String deliverZip);
}
