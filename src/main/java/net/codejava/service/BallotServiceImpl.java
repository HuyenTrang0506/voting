package net.codejava.service;

import net.codejava.entity.Ballot;
import net.codejava.service.service.BallotService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BallotServiceImpl implements BallotService {
    @Override
    public Ballot save(Ballot ballot) {
        return null;
    }

    @Override
    public Ballot findBallotById(Long id) {
        return null;
    }

    @Override
    public Ballot update(Ballot ballot) {
        return null;
    }

    @Override
    public void deleteBallotById(Long id) {

    }
}
