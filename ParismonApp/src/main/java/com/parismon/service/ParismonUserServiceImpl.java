/**
 * 
 */
package com.parismon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.parismon.dao.ParismonUserDao;
import com.parismon.model.ParismonUser;

/**
 * @author mjedli
 *
 */
@Service("userService")
@Transactional
public class ParismonUserServiceImpl implements ParismonUserService {

	@Autowired
	private ParismonUserDao parismonUserDao;

	public ParismonUser findById(int id) {
		return parismonUserDao.findById(id);
	}

	public void saveUser(ParismonUser parismonUser) {
		parismonUserDao.saveUser(parismonUser);	
	}

	public void deleteUserByEmail(String email) {
		parismonUserDao.deleteUserByEmail(email);
	}

	public List<ParismonUser> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
