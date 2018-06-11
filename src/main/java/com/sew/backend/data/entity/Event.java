package com.sew.backend.data.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.BatchSize;
import com.sew.backend.data.OrderState;

@Entity(name = "Event")

@Table(indexes = @Index(columnList = "VorschlagDate"))
public class Event extends AbstractEntity
{
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private User ersteller;

    @NotNull(message = "{bakery.due.date.required}")
    private LocalDate dueDate;

    @NotNull(message = "{bakery.due.time.required}")
    private LocalTime dueTime;

    private String name;

    private String inhalt;

    public Event(User createdBy) {
        setErsteller(new User());
        //addHistoryItem(createdBy, "Order placed");
    }

    public User getErsteller() {
        return ersteller;
    }

    public void setErsteller(User ersteller) {
        this.ersteller = ersteller;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalTime dueTime) {
        this.dueTime = dueTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }
}
