package Service;

import Dao.InstructDao;

public interface InstructService {
	public String getSerialNumber();
	public Double getPrice();
	public InstructSpecService getInstructSpecService();
	public void setInstructSpecService(InstructSpecService instructSpecService);
	public void setSerialNumber(String serialNumber);
	public void setPrice(Double price);
}
