package com.cobi.fetchjoin;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "team")
@Entity
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  public String name;
  
  public int age;
  
  @ManyToOne(fetch = FetchType.LAZY)
  public Team team;
  
  public Member(String name, int age, Team team) {
    this.name = name;
    this.age = age;
    this.team = team;
  }
}
