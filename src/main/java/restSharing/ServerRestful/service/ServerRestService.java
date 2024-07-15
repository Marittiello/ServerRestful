package restSharing.ServerRestful.service;

import restSharing.ServerRestful.model.User;

public interface ServerRestService{

	public boolean insert(User user);
	
	public User getByUserCode(String userCode);
}
