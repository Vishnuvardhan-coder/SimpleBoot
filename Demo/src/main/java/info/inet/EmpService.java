package info.inet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class EmpService {
    @Autowired
	private EmpRepo empRepo;
	public void saveEmp(Employee employee) {
		empRepo.save(employee);
		
	}
}
