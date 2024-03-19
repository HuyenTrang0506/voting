package net.codejava.service.service;

import net.codejava.entity.Election;

public interface ElectionService {
    Election save(Election election);
    Election findElectionById(Long id);
    Election update(Election election);
    Boolean delete(Election election);
}
