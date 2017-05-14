package Service;

import java.util.HashMap;
import java.util.Map;


public interface InstructSpecService {	
	public boolean matches(InstructSpecService otherSpec);
	public Map getProperties();
	public void setProperties(Map properties);
}
