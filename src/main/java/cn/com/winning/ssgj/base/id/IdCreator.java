package cn.com.winning.ssgj.base.id;


/**
 * ID创建接口。
 * @author Administrator
 * @param <T> 对象
 */
public interface IdCreator<T> {

	public abstract T create();
	
	public abstract T create(int i);
	
}
