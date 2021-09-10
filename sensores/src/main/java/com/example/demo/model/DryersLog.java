package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class DryersLog {

    @Id
    private Integer id;

   @OneToOne(cascade = CascadeType.ALL, mappedBy = "dryersLog")
   private Channel channel;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "dryersLog")
   private List<Field> feeds;

}
