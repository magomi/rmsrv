package org.codefromhell.rupmoves.srv.repo;

import org.codefromhell.rupmoves.srv.data.Activity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepo extends PagingAndSortingRepository<Activity, String> {
}
