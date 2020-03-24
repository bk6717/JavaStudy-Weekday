package di;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class ContainerService {
	public static <T> T getObject(Class<T> classType) {
		// �⺻�����ڸ� ���ؼ� �ν��Ͻ��� �����.
		// ���⼭ instance�� ArticleController Ŭ���� ��ü
		T instance = createInstance(classType);
		
		// Ŭ������ ��� �ʵ带 �ҷ��´�.
		Stream.of(classType.getDeclaredFields())
			.filter(field -> field.isAnnotationPresent(AutoWired.class)) // ������̼ǿ� AutoWired�� ���� �ʵ常 ����
			.forEach(field -> {
				// �ʵ��� �ν��Ͻ��� ���� ArticleServiceŸ�� (�ѹ��� ����)
				Object fieldInstance= createInstance(field.getType());
				// �ʵ��� ������� private�� ��� ���������ϰ� ����
				field.setAccessible(true);
				try {
					// field == private ArticleService articleService�ʵ�
					// instance = ArticleController ��ü
					// fieldInstance = ArticleService ��ü
					field.set(instance, fieldInstance);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
				
			});
		return instance; // ArticleController ����!!
	}
	
	private static <T> T createInstance(final Class<T> classType) {
		try {
			return classType.getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}
