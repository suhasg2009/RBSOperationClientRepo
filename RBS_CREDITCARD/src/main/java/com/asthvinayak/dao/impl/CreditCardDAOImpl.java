package com.asthvinayak.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.asthvinayak.dto.CreditCardDTO;
import com.asthvinayak.util.DBUtil;

public class CreditCardDAOImpl {
	private CreditCardDAOImpl() {
		
	}
	static CreditCardDAOImpl INSTANCE = null;

	public static synchronized CreditCardDAOImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreditCardDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}
	

public void getCardDetails(CreditCardDTO creditCardDTO) throws SQLException {
System.out.println("Enter into getCardDetails ");
Connection con = DBUtil.getConnection();
	
}}
