package org.jpwh.model.simple;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
