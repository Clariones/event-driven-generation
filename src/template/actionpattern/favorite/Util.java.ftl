package ${base_package}.aputils;

/**
 * 定制化部分。 默认的 base 就应该可以用了
 */
public class Favorite${target_class}Of${actor_class}Util extends BaseFavorite${target_class}Of${actor_class}Util{
	public static Favorite${target_class}Of${actor_class}Util instance = new Favorite${target_class}Of${actor_class}Util();
	private Favorite${target_class}Of${actor_class}Util() {
		// 您不能实例化工具类
	}
	public static Favorite${target_class}Of${actor_class}Util getInstance() {
		return instance;
	}
}
