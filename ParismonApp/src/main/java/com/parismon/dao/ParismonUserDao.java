/**
 * 
 */
package com.parismon.dao;

import java.util.List;
import com.parismon.model.ParismonUser;

/**
 * @author mjedli
 *
 */
public interface ParismonUserDao {

	ParismonUser findById(int id);
	
	void saveUser(ParismonUser parismonUser);
	
	void deleteUserByEmail(String email);
	
	List<ParismonUser> findAllUser();
}
