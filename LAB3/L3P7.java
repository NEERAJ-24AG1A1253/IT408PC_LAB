import java.lang.*;
abstract class Creature{
	abstract public void Sound();
}
class Lion extends Creature{
	@Override
	public void Sound(){
		System.out.println("lion sound");
	}
}
class Tiger extends Lion{
	@Override
	public void Sound(){
		System.out.println("tiger sound");
	}
}
abstract class L3P7{
	public static void main(String...args){
		Lion l = new Lion();
		l.Sound();
		Tiger t = new Tiger();
		t.Sound();
	}
}