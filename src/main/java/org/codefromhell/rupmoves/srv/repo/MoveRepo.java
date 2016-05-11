package org.codefromhell.rupmoves.srv.repo;

import org.codefromhell.rupmoves.srv.data.Move;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "moves", path = "moves")
public interface MoveRepo extends PagingAndSortingRepository<Move, Long> {
}
