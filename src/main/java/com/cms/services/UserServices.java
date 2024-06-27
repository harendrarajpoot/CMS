package com.cms.services;

import com.cms.dto.UserDto;
import com.cms.entities.User;

public interface UserServices {

	User findUserByEmail(String email);

	User saveUser(UserDto userdto);

}
