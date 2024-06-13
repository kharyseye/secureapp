package com.samanecorp.secureapp.dao.impl;

import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.samanecorp.secureapp.dao.interfaces.IAccountUser;
import com.samanecorp.secureapp.entities.AccountUserEntity;
import com.samanecorp.secureapp.hibernate.HibernateUtil;

public class AccountUserImpl extends RepositoryImpl<AccountUserEntity> implements IAccountUser {
//cette classe herite de repoImpl et implemente IAccount 
//car nous avons utiliser un interface generique pour les methodes CRUD
//et implement IAccount pour recuperer la methode login cree
	
	private Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public Optional<AccountUserEntity> login(String email, String password) {
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<AccountUserEntity> cq = cb.createQuery(AccountUserEntity.class);
		Root<AccountUserEntity> user = cq.from(AccountUserEntity.class);
		
		cq.select(user);
		
		//le predicate est utilisé pour les clauses where sql
		
		Predicate predicateEmail = cb.equal(user.get("email"), email);
		Predicate predicatePwd = cb.equal(user.get("password"), password);
		Predicate finalPredicate = cb.and(predicateEmail, predicatePwd);
		
		cq.select(user);
		cq.where(finalPredicate);
		
		return session.createQuery(cq).uniqueResultOptional();
	}

}
