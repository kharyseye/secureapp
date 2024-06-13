package com.samanecorp.secureapp.services.impl;

import java.util.Optional;

import com.samanecorp.secureapp.dao.impl.AccountUserImpl;
import com.samanecorp.secureapp.dao.interfaces.IAccountUser;
import com.samanecorp.secureapp.dto.AccountUserDto;
import com.samanecorp.secureapp.services.interfaces.IAccountUserService;

public class AccountUserServiceImpl  implements IAccountUserService{
	
	private IAccountUser accountUser;
	
	public AccountUserServiceImpl() {
		this.accountUser = new AccountUserImpl();
	}

	@Override
	public Optional<AccountUserDto> login(String email, String password) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean save(AccountUserDto accountUserDto) {
		// TODO Auto-generated method stub
		return false;
	}

}
