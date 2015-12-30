package Service;

import java.util.List;

import orm.Userinfo;

import com.basic.dao.ALL_DAO;

public class UserinfoService {
	private ALL_DAO allDao;

	public ALL_DAO getAllDao() {
		return allDao;
	}

	public void setAllDao(ALL_DAO allDao) {
		this.allDao = allDao;
	}
	
	public List<Userinfo> getAllUserinfoList(){
		return allDao.getUserinfoDao().getAllUserinfo();
	}
	
	public void insertUserinfo(String username,String password){
		//Userinfo user=new Userinfo("798750508@qq.com", "woainixxx1314");
		Userinfo user=new Userinfo(username, password);
		allDao.getUserinfoDao().save(user);
	}
	
}
