abstract class Wild{
	abstract public void behave();
}
class Tigre extends Wild{
	@Override
	public void behave(){
		System.out.println("tiger jumps");
	}
}
class Roar extends Tigre{
	public void Sound(){
		System.out.println("tiger sound");
	}
}
abstract class L3P8{
	public static void main(String...args){
		Tigre t = new Tigre();
		t.behave();
		Roar r = new Roar();
		r.Sound();
	}
}