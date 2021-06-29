package com.cobi.fetchjoin;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TeamService {
  private final TeamRepository teamRepository;

  public TeamService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  @Transactional
  public void initialize(){
    Team team1 = Team.builder()
      .name("team1")
      .build();

    Member member1 = Member.builder()
      .name("team1member1")
      .age(1)
      .build();
    Member member2 = Member.builder()
      .name("team2member2")
      .age(2)
      .build();
    Member member3 = Member.builder()
      .name("team3member3")
      .age(3)
      .build();
    
    team1.addMember(member1);
    team1.addMember(member2);
    team1.addMember(member3);

    Team team2 = Team.builder()
      .name("team2")
      .build();

    Member member4 = Member.builder()
      .name("team2member4")
      .age(4)
      .build();

    Member member5 = Member.builder()
      .name("team2member5")
      .age(5)
      .build();
    
    team2.addMember(member4);
    team2.addMember(member5);

    teamRepository.save(team1);
    teamRepository.save(team2);
  }

  @Transactional
  public List<Team> findAllWithMemberUsingJoin(){
    return teamRepository.findAllWithMemberUsingJoin();
  }

  @Transactional
  public List<Team> findAllWithMemberUsingFetchJoin(){
    return teamRepository.findAllWithMemberUsingFetchJoin();
  }

  @Transactional
  public List<Team> findByMemberNameWithMemberUsingJoin(String memberName){
    return teamRepository.findByMemberNameWithMemberUsingJoin(memberName);
  }
}
