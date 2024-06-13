package com.samanecorp.secureapp.mapper;

import com.samanecorp.secureapp.dto.AccountUserDto;
import com.samanecorp.secureapp.entities.AccountUserEntity;

public class AccountUserMapper {
	
	//cette methode permet de convertir les dto en entites 
	
	public static AccountUserEntity UserDtoToUserEntity(AccountUserDto userDto) {
		
		AccountUserEntity userEntity = new AccountUserEntity();
		
		userEntity.setId(userDto.getId());
		userEntity.setEmail(userDto.getEmail());
		userEntity.setPassword(userDto.getPassword());
		
		return userEntity;
	}
	
	//cette methode permet de convertir les entites en  dto
	
		public static AccountUserDto UserEntityToUserDto(AccountUserEntity userEntity) {
			
			AccountUserDto userDto = new AccountUserDto();
			
			userDto.setId(userEntity.getId());
			userDto.setEmail(userEntity.getEmail());
			userDto.setPassword(userEntity.getPassword());
			
			return userDto;
		}

}
