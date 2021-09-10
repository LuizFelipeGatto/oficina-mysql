package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class Field {

    @Id
    private Integer entry_id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="id_dryers_log", referencedColumnName = "id")
    private DryersLog dryersLog;
}
