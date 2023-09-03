package org.jpwh.model.simple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*
Đây là lớp thực thể cơ bản nhất, được đánh dấu là "có khả năng bền vững" bằng chú thích @Entity, và có ánh xạ @Id
cho thuộc tính định danh của cơ sở dữ liệu. Lớp này mặc định ánh xạ vào một bảng có tên là ITEM trong mô hình cơ sở dữ liệu.
*/

@Entity
public class Item {
    @Id
    @GeneratedValue (generator = "ID_GENERATOR")
    protected Long id;

    // Không bắt buộc nhưng hữu ích
    // Optional but useful

    public Long getId() {
        return id;
    }
}
