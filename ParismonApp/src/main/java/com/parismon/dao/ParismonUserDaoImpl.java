/**
 * 
 */
package com.parismon.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parismon.model.ParismonUser;

/**
 * @author mjedli
 *
 */
@Repository("parismonUserDao")
public class ParismonUserDaoImpl implements ParismonUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ParismonUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(ParismonUser parismonUser) {
		sessionFactory.getCurrentSession().save(parismonUser);
	}

	public void deleteUserByEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	public List<ParismonUser> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}