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
public class Channel {

    @Id
    private Integer id;
    private String name;
    private String description;
    private Double latitude;
    private Double longitude;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;
    private Integer last_entry_id;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="id_dryers_log", referencedColumnName = "id")
    private DryersLog dryersLog;

}
