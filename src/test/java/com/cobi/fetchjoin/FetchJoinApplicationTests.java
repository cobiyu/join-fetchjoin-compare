package com.cobi.fetchjoin;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FetchJoinApplicationTests {
  @Autowired
  private TeamService teamService;
  
  @BeforeEach
  public void init(){
    teamService.initialize();
  }

  @Test
  public void joinTest() {
    List<Team> memberUsingJoin = teamService.findAllWithMemberUsingJoin();
    //break point
    System.out.println(memberUsingJoin);
  }

  @Test
  public void fetchJoinTest() {
    List<Team> memberUsingFetchJoin = teamService.findAllWithMemberUsingFetchJoin();
    //break point
    System.out.println(memberUsingFetchJoin);
  }

  @Test
  public void joinConditionTest() {
    List<Team> memberUsingJoin = teamService.findByMemberNameWithMemberUsingJoin("team2member4");
    //break point
    System.out.println(memberUsingJoin);
  }
  
}
