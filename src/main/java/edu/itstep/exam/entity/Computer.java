package edu.itstep.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name ="computers")
public class Computer extends BaseEntity{

    @Column(name = "model")
    private String model;
    @Column(name = "serial_number")
    private String serialNumber;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
