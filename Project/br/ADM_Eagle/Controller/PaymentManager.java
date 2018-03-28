package br.ADM_Eagle.Controller;

import java.util.ArrayList;

import br.ADM_Eagle.DAO.PaymentManagerDAO;
import br.ADM_Eagle.Models.Payment;

public class PaymentManager {
	private ArrayList<Payment> paymentList;
	private PaymentManagerDAO paymentDao;

	public PaymentManager(ArrayList<Payment> paymentList, PaymentManagerDAO paymentDao) {
		super();
		this.paymentList = paymentList;
		this.paymentDao = paymentDao;
	}

	public String toString() {
		return "PaymentManager [paymentList=" + paymentList + ", paymentDao=" + paymentDao + "]";
	}

	public ArrayList<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(ArrayList<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public PaymentManagerDAO getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentManagerDAO paymentDao) {
		this.paymentDao = paymentDao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paymentDao == null) ? 0 : paymentDao.hashCode());
		result = prime * result + ((paymentList == null) ? 0 : paymentList.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentManager other = (PaymentManager) obj;
		if (paymentDao == null) {
			if (other.paymentDao != null)
				return false;
		} else if (!paymentDao.equals(other.paymentDao))
			return false;
		if (paymentList == null) {
			if (other.paymentList != null)
				return false;
		} else if (!paymentList.equals(other.paymentList))
			return false;
		return true;
	}

}
