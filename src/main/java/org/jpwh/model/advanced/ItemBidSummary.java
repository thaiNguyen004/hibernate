package org.jpwh.model.advanced;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;

import javax.persistence.*;

@Entity
@Immutable
@Subselect(
        value = "SELECT i.ID as ITEMID, i.ITEM_NAME as NAME, COUNT(b.ID) as NUMBEROFBIDS " +
                "FROM ITEM i left outer join BID b on i.ID = b.ITEM_ID " +
                "GROUP BY i.ID, i.ITEM_NAME"
)
@Synchronize({"Item", "Bid"})
public class ItemBidSummary {
    @Id
    protected Long itemId;
    protected String name;
    protected long numberOfBids;

    public ItemBidSummary() {
    }

    // Getter method...

}
