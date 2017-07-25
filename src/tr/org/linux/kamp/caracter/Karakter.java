package tr.org.linux.kamp.caracter;
import java.util.Random;

public class Karakter {

	
	public static void main(String[] args) {
		Random rgen= new Random();
		char letter=(char) (rgen.nextInt(26)+'A');	
		System.out.println(letter);
		
		if("hello" == "hello") System.out.println("true");
		
		String a=new String ("hello world");
		String b=new String ("hello");
		
		System.out.println(a==b);//true ama kullanma patlar
		System.out.println(a.equals("hello"));//== yerine kullan
		System.out.println(a.equals(b));
		System.out.println(a.subSequence(1, 5));// ilk verdiğimiz dahil son verdiğimiz dahil değil.
		System.out.println(a.indexOf('e'));// bulunduğu index
		System.out.println(a.indexOf("elloo"));
		System.out.println(a.substring(a.indexOf(' ')+1, a.length()));
		System.out.println(a.substring(0, 2)=="he");//false
		System.out.println(a.substring(0, 2).equals("he"));//true
	}
}
