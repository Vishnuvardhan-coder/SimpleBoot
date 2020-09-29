package info.inet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String msg(Model model) {
		model.addAttribute("employee", new Employee());
		return "form";
		
	}
	@RequestMapping(method=RequestMethod.POST)
	public String Savedata(Employee employee)
	{
		empService.saveEmp(employee);
		return "success";
	}
}

