package com.cg.hsm.daoimpl;

import com.cg.hsm.dao.RoleDAO;
import com.cg.hsm.domain.Role;
import com.cg.hsm.util.DBUtil;

public class RoleDAOImpl extends DBUtil implements RoleDAO{

	@Override
	public void registerRole(Role role) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
		entityManager.persist(role);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
