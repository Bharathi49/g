package com.tyss.ehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ehub.dao.Billabledao;
import com.tyss.ehub.dto.Billable;

@Service
public class BillableServiceImpl implements BillableService {

	@Autowired
	private Billabledao dao;

	@Override
	public boolean insert(Billable bill) {
		return dao.insert(bill);
	}

	@Override
	public List<Billable> getAllBillable() {
		return dao.getAllBillable();
	}

	@Override
	public boolean delete(int bId) {
		return dao.delete(bId);
	}

	@Override
	public boolean update(Billable bill) {
		return dao.update(bill);
	}

}
