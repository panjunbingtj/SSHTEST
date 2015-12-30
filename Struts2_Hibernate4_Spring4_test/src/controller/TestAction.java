package controller;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public class TestAction extends BaseAction{

	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		System.out.println(getAllService().getUserinfoService().getAllUserinfoList().toString());
		
		return super.execute();
	}
	
}
