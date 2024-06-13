package com.samanecorp.secureapp.dao.interfaces;

import java.util.Optional;

import com.samanecorp.secureapp.entities.AccountUserEntity;

public interface IAccountUser extends Repository<AccountUserEntity>{
	
	public Optional<AccountUserEntity> login(String email, String password);

}
