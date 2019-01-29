package com.services;

import java.util.List;

public interface LoginService {

	List<Object[]> verifyUser(String username, String password);

	List<Object[]> listUser();

}
