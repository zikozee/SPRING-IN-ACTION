package tacos.repository;

import tacos.domain.TacoOrder;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 February 2023
 */

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
