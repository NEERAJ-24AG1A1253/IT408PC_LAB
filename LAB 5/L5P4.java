import java.lang.reflect.Method;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bullet{
	String str();
	double dbl();
}
class L5P4{
	@Bullet(str="Camlin",dbl=12.36658)
	public static void anyMethod(){
		try{
			Method mtd = L5P3.class.getMethod("anyMethod");
			Bullet b = mtd.getAnnotation(Bullet.class);
			System.out.println("String...."+b.str());
			System.out.println("Double...."+b.dbl());
		}catch (NoSuchMethodException e){
			System.out.println("Method not found:"+e.getMessage());
		}catch(Exception e){
			System.out.println("general exception:"+e.getMessage());
		}
		}
	public static void main(String...args){
		anyMethod();
	}
}

		
