package ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;

import Dao.InstructDao;
import DaoImpl.InstructDaoImpl;
import Service.InstructService;
import Service.InstructSpecService;


public class InstructServiceImpl implements InstructService{
	private String serialNumber;
	private Double price;	
	private InstructSpecService instructSpecService;	
	public InstructServiceImpl() {
		super();		
	}
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}
	@Override
	public Double getPrice() {
		return price;
	}
	@Override
	public InstructSpecService getInstructSpecService() {
		return instructSpecService;
	}
	public void setInstructSpecService(InstructSpecService instructSpecService) {
		this.instructSpecService = instructSpecService;	
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "InstructServiceImpl [serialNumber=" + serialNumber + ", price=" + price + ",  instructSpecService=" + instructSpecService + "]";
	}
	
}
