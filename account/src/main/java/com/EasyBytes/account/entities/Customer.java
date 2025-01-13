package com.EasyBytes.account.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class Customer extends BaseEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long customer_id;
    private String name;
    private String email;
    private String mobile_number;
}