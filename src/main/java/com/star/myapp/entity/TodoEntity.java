package com.star.myapp.entity;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Todo")
@Table(name = "TODO")
@Getter
@Setter
public class TodoEntity {

  @Id
  @GeneratedValue
  private UUID id;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "COLOR")
  private String color;

  @CreationTimestamp
  @Column(name = "CREATED_DATE")
  private LocalDate createdDate;

  @UpdateTimestamp
  @Column(name = "UPDATED_DATE")
  private LocalDate updatedDate;
}
