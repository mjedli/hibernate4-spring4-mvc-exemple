/**
 * 
 */
package com.parismon.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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
		return (ParismonUser) sessionFactory.getCurrentSession().get(ParismonUser.class, id);
	}

	public void saveUser(ParismonUser parismonUser) {
		sessionFactory.getCurrentSession().save(parismonUser);
	}

	public void deleteUserByEmail(String email) {
		Query query = sessionFactory.getCurrentSession()
				.createSQLQuery("delete from User where email = :email");
        query.setString("email", email);
        query.executeUpdate();
		
	}

	public List<ParismonUser> findAllUser() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ParismonUser.class);
        return (List<ParismonUser>) criteria.list();
	}

}
