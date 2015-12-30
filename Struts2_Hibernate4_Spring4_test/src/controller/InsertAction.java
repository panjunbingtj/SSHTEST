package controller;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public class InsertAction extends BaseAction{

	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		getAllService().getUserinfoService().insertUserinfo("798750509@qq.com", "woainixxx1314");
		return "success";
	}
	
}
