package tr.org.linux.kamp.hobbits;

public class Hobbits {

	String name;
	public static void main(String[] args) {
		
		Hobbits[] hobbits=new Hobbits[3];
		int z=0;
		while(z<3) {
			//hobbits[z]= new Hobbits;
			hobbits[z].name= "Frodo";
			
			if(z==1) {
				
				hobbits[z].name="Bilbo";
			}
			z++;
			System.out.println(hobbits[z].name);
		}
	}
	
}
