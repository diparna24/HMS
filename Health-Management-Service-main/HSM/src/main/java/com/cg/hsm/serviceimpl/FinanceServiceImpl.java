package com.cg.hsm.serviceimpl;

import java.util.List;
import com.cg.hsm.dao.FinanceDAO;
import com.cg.hsm.daoimpl.FinanceDAOImpl;
import com.cg.hsm.domain.Finance;
import com.cg.hsm.exception.PatientFinanceDetailsNotFoundException;
import com.cg.hsm.service.FinanceService;
/**
 * This FinanceServiceImpl class implements services of FinanceService 
 * @author kethu_greeshma
 *
 */
public class FinanceServiceImpl implements FinanceService {
	
	FinanceDAO finDAO = new FinanceDAOImpl();
	
	@Override
	public Finance getPatientReport(String name) throws PatientFinanceDetailsNotFoundException {
		Finance finance = new Finance();
		List<Finance> finances = finDAO.findAll();
		for(Finance fin: finances) {
			if(fin.getPatientName().equalsIgnoreCase(name)) {
				return fin;
			}
		}
		
		return finance;
	}
	
}