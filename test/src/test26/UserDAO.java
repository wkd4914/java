package test26;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	public int insertUerInfo(HashMap<String,String> userInfo);
	public int deleteUerInfo(HashMap<String,String> userInfo);
	public int updateUerInfo(HashMap<String,String> userInfo);
	public ArrayList<HashMap<String,String>>
	selectUserInfoList(HashMap<String,String> userInfo);
}
