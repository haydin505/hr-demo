package net.dialecticsoftware.hrdemo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import net.dialecticsoftware.hrdemo.enums.Department;
import net.dialecticsoftware.hrdemo.enums.Level;

/**
 * @author huseyinaydin
 */
@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String firstname;

  @Column(nullable = false)
  private String lastname;

  @Column(nullable = false)
  private LocalDateTime birthDate;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Department department;

  @Column(nullable = false)
  private BigDecimal salary;

  @Column(nullable = false)
  private LocalDateTime startDate;

  private LocalDateTime endDate;

  private Double performance;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Level level;

  public Employee() {
  }

  public Employee(String firstname, String lastname, LocalDateTime birthDate, Department department, BigDecimal salary,
                  LocalDateTime startDate, Level level) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthDate = birthDate;
    this.department = department;
    this.salary = salary;
    this.startDate = startDate;
    this.level = level;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public LocalDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public Double getPerformance() {
    return performance;
  }

  public void setPerformance(Double performance) {
    this.performance = performance;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }
}
