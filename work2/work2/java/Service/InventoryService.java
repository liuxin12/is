package Service;

import java.util.List;

import ServiceImpl.InstructServiceImpl;
import ServiceImpl.InstructSpecServiceImpl;

public interface InventoryService {
	public void addInstructService(String serialNumber,Double price,InstructSpecService InstructSpecService);
	public InstructService getInstructService(String serialNumber);
	public List<InstructService> serach(InstructSpecService searchInstructSpec);
	public List<InstructService> getInstructServices();
}
