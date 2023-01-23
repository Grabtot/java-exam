package edu.itstep.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "services")
public class Service extends BaseEntity{

    @Column(name = "price")
    private int price;
    @Column(name = "name")
    private String name;
}
