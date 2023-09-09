package org.jpwh.model.simple;



import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
/*
    Using vendor extension
    Sử dụng annotation riêng của Hibernate không nằm trong API Java Persistence
*/
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Item {
}
