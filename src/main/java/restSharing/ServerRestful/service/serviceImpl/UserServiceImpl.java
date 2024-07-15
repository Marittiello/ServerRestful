package restSharing.ServerRestful.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restSharing.ServerRestful.model.*;
import restSharing.ServerRestful.repo.ServerRestRepo;
import restSharing.ServerRestful.service.ServerRestService;

@Service
public class UserServiceImpl implements ServerRestService{

	@Autowired
	ServerRestRepo repo;

	@Override
	public boolean insert(User user) {
		if(user!=null) {
			repo.save(user);
			return true;
		}
		return false;
	}

	@Override
	public User getByUserCode(String userCode) {
		User user= repo.findByUserCode(userCode);
		if(user!=null) {
			return user;
		}
		return null;
	}


}
