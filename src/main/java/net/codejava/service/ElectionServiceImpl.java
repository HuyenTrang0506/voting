package net.codejava.service;

import net.codejava.entity.Election;
import net.codejava.service.service.ElectionService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ElectionServiceImpl implements ElectionService {
    @Override
    public Election save(Election election) {
        return null;
    }

    @Override
    public Election findElectionById(Long id) {
        return null;
    }

    @Override
    public Election update(Election election) {
        return null;
    }

    @Override
    public Boolean delete(Election election) {
        return null;
    }
}
