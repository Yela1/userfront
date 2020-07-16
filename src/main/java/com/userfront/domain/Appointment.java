package com.userfront.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;





}
