package net.codejava.service.service;

import net.codejava.dto.BallotDTO;
import net.codejava.entity.Ballot;

public interface BallotService {
    Ballot save(BallotDTO ballotDTO);

    Ballot findBallotById(Long id);
    Ballot update(Ballot ballot);

    void deleteBallotById(Long id);

}
