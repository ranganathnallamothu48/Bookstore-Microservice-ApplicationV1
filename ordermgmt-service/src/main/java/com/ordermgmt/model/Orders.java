package com.ordermgmt.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Orders {
    @Id
    private Long id;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "BOOK_ID")
    private String bookId;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ORDER_STATUS")
    private OrderStatus orderStatus;
}
