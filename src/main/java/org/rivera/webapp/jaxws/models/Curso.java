package org.rivera.webapp.jaxws.models;

public class Curso {
  private String name;

  public Curso() {
  }

  public Curso(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
