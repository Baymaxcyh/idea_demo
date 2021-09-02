package map;

import java.util.HashMap;

/**
 * @author Hiro
 */
public class HmDemo {
	//	工具类的 常用 设计方式 链式调用语法 ， 让所有工具类中的方法返回当前类
	public static void main(String[] args) {
		UserInfo ui1 = new UserInfo("123","34","345","1");
		UserInfo ui2 = new UserInfo("123","34","345","2");
		UserInfo ui3 = new UserInfo("123","34","345","3");
		UserInfo ui4 = new UserInfo("123","34","345","4");
		UserInfo ui5 = new UserInfo("123","34","345","1");
//		ui1 和 ui5 的内容是完全相同的。可以理解为，服务器从数据查到的用户信息与用户输入的用户信息的关系。
//		两个独立的数据个体，但是内容相同，逻辑上我们应该认为是相同的。

		HashMap<UserInfo, String> map = new HashMap<UserInfo, String>();

		map.put(ui1, "信息1");
		map.put(ui2, "信息2");
		map.put(ui3, "信息3");
		map.put(ui4, "信息4");

		ui1.setId("qweqwe");
		System.out.println(map.get(ui1));


		for (int i = 0; i < 10; i++) {
			map.put(new UserInfo("123","34","345","1"), ""+i);
		}


		System.out.println(map.size());
		map.forEach((key,value)->{
			System.out.println("key:"+key+"\tvalue:"+value);
		});

		String value = map.get(ui5);
		System.out.println(value);

//		hashmap内存泄漏问题
//		1、存储的key 类型 没有正确的重写hashcode 和 equals 方法
//		2、存储的key 对象 参与hashcode运算 的变量发生数据变化。
//		map中 key 的对象参数hashcode运算的变量绝对不改。
//		如果需要修改这些变量就先删除历史数据插入修改后数据。








//		工具A.载入数据("abc").加宽("123").加高(123).透明(50%)

//		工具A.载入数据("abc")；
//		工具A.加宽("123")；
//		工具A.加高(123)；
//		工具A.透明(50%)；

	}
}
//企业开发， 模型层 封装类

class UserInfo{
	private String id;
	private String username;
	private String password;
	private String tel;
//	alt+shift+s

//	getters setters
//	toString
//	using field
//	hashcode  and  equals

	public String getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserInfo other = (UserInfo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (tel == null) {
			if (other.tel != null) {
				return false;
			}
		} else if (!tel.equals(other.tel)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "map.UserInfo [id=" + id + ", username=" + username + ", password=" + password + ", tel=" + tel + "]";
	}
	public UserInfo(String id, String username, String password, String tel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tel = tel;
	}

}
