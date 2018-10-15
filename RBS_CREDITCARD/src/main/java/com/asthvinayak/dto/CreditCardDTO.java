package com.asthvinayak.dto;

import java.io.Serializable;
import java.sql.Date;

public class CreditCardDTO implements Serializable {

	private static final long serialVersionUID = 1L;
     
	private String cardName;
	private long cardNo;
	private int cardCVV;
	private Date cardExpdate;
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public long getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	
	public int getCardCVV() {
		return cardCVV;
	}
	
	public void setCardCVV(int cardCVV) {
		this.cardCVV = cardCVV;
	}
	
	public Date getCardExpdate() {
		return cardExpdate;
	}
	
	public void setCardExpdate(Date cardExpdate) {
		this.cardExpdate = cardExpdate;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "CreditCardDTO [cardName="  + cardName + ", cardNo=" + cardNo + ", cardCVV="  + cardCVV + ", cardExpdate="  + cardExpdate + "]";
	
	}
}
