package net.codejava.service.service;

import net.codejava.entity.Ballot;

public interface BallotService {
    Ballot save(Ballot ballot);

    Ballot findBallotById(Long id);
    Ballot update(Ballot ballot);

    void deleteBallotById(Long id);

}
