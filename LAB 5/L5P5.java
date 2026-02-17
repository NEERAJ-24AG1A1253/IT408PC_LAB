import java.io.*;
class L5P5{
	public static void main(String...args) throws IOException{
		File f = new File("Rohan.java");
		if(f.exists()){
			System.out.println("yes file exists");
		}else{
			f.createNewFile();
			System.out.println("File exists : "+f.exists());
		}
	}
}