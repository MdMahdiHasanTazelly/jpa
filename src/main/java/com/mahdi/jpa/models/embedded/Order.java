package com.mahdi.jpa.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="embedded_order")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @EmbeddedId
    private OrderId id;
    private String orderInfo;
    private String anotherField;

    @Embedded
    private Address address;
    
}
