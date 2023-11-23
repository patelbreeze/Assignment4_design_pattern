/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package design_pattern.Filter;

/**
 *
 * @author Breeze
 */
import java.util.List;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}
