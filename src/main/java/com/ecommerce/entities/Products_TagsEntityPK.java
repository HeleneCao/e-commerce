package com.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Products_TagsEntityPK implements Serializable {

    @Column(name="id_product")
    private Integer id_product;

    @Column(name="id_tag")
    private Integer id_tag;
}
