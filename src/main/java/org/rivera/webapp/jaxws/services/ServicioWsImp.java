package org.rivera.webapp.jaxws.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.rivera.webapp.jaxws.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.rivera.webapp.jaxws.services.ServicioWs")  //Indico que métodos se van a implementar en el servicio web, si quiere que sean todos quito "endpointInterface"
public class ServicioWsImp implements ServicioWs{

  private int count;

  @Override
  @WebMethod  //Para que se puedan publicar
  public String greet(String person) {
    System.out.println("Imprimiendo dentro del servicio web con instancia: " + this);
    count++;
    System.out.println("Valor del contador en método saludar: " + count);
    return "Hola que tal " + person;
  }

  @Override
  @WebMethod
  public List<Curso> listCourses() {
    return Arrays.asList(new Curso("Java"), new Curso("Angular"), new Curso("Spring"), new Curso("Jakarta"));
  }

  @Override
  @WebMethod
  public Curso course(Curso course) {
    System.out.println("Curso guardado con éxito: " + course.getName());
    Curso newCourse = new Curso();
    newCourse.setName(course.getName());
    return newCourse;
  }

}
