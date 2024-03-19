package net.codejava.repository;

import net.codejava.entity.Result;
import net.codejava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BallotRepository extends JpaRepository<Result, Long> {
    Result findByElectionId(Long electionId);
}
