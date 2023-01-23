package edu.itstep.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "countries")
public class Country extends BaseEntity{

    @Column(name = "name")
    private String name;

}
