package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Program {

	public static void getFieldIInfo(Class<?> clazz) {
		if (clazz != null) {
			Field[] fields = clazz.getDeclaredFields();

			for (Field field : fields) {
				System.out.println("Field : " + field.getName() + " | Type : " + field.getType());
			}
			System.out.println();
		}
	}

	private static void getMethodInfo(Class<?> clazz) {
		if (clazz != null) {
			Method[] methods = clazz.getDeclaredMethods();

			for (Method method : methods) {
				System.out.println("Method : " + method);
			}
			System.out.println();
		}
	}

	private static void getConstructorInfo(Class<?> clazz) {
		if (clazz != null) {
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor);
			}
			System.out.println();
		}
	}

	
	private static void getTypeInfo(Class<?> clazz) {
		if (clazz != null) {
			System.out.println("F.Q class name : "+clazz.getPackage().getName());
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}	
	}

	
	public static void main(String[] args) {
		String str = new String();
		Class<?> clazz = str.getClass();
		Program.getFieldIInfo(clazz);
		Program.getMethodInfo(clazz);
		Program.getConstructorInfo(clazz);
		Program.getTypeInfo(clazz);

	}

	
}
