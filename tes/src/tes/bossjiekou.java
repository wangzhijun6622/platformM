package tes;
import java.util.Set;

public interface bossjiekou {
	//查询数据  返回一个结果集
	public Set<boss> findAll() throws Exception;
	//删除数据   
	public void delect(int id);
}
