package org.codefromhell.rupmoves.srv.repo;

import org.codefromhell.rupmoves.srv.data.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepo extends PagingAndSortingRepository<User, String> {
    User findByEmail(@Param("email") String email);
}
