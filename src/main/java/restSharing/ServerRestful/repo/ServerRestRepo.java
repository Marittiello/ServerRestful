package restSharing.ServerRestful.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import restSharing.ServerRestful.model.User;

public interface ServerRestRepo extends JpaRepository<User, Integer>{

	public User findByUserCode(String userCode);
}
