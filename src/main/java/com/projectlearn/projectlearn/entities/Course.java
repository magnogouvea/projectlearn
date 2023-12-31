package com.projectlearn.projectlearn.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String imgUri;
  private String imgGrayUri;

  public Course() {
  }

  public Course(Long id, String name, String imgUri, String imgGrayUri) {
    super();
    this.id = id;
    this.name = name;
    this.imgUri = imgUri;
    this.imgGrayUri = imgGrayUri;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
  }

  public String getImgGrayUri() {
    return imgGrayUri;
  }

  public void setImgGrayUri(String imgGrayUri) {
    this.imgGrayUri = imgGrayUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Course course)) return false;
    return Objects.equals(getId(), course.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
