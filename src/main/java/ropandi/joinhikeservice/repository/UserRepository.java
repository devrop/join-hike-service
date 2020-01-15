package ropandi.joinhikeservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ropandi.joinhikeservice.entity.MUser;
@Repository
public interface UserRepository extends JpaRepository<MUser, String> {

	@Query("select m from MUser m where m.email =:email and m.password =:password")
	Optional<MUser> findByEmailAndPassword(@Param("email") String email,@Param("password") String password);
	@Query("select m from MUser m where m.email =:email and m.status = 1")
	Optional<MUser> findByEmail(@Param("email") String email);
	
	
}
