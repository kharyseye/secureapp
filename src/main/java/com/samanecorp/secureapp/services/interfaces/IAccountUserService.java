package com.samanecorp.secureapp.services.interfaces;

import java.util.Optional;
import com.samanecorp.secureapp.dto.AccountUserDto;

public interface IAccountUserService {
	
	public Optional<AccountUserDto> login(String email, String password);
	public boolean save (AccountUserDto accountUserDto);


}
