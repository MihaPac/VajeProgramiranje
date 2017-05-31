
public class Poudarjanje {

	public static void main(String[] args) {
		poudarjanje("Halo halo");
	}
	public static String poudarjanje(String str){
		String izpis = "";
		String presledek = "";
		for(int i = 0; i < str.length() ; i++) { 
		    char c = str.charAt(i);
		    izpis += presledek + c;
		    presledek = " ";
		}
		return izpis.toUpperCase();
	}
	public static String poudarjanjePosebno(String str){
		String izpis = "";
		String zapoudarit = "";
		String presledek = "";
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			boolean izvajaj = false;
			if(c=='*')izvajaj = true;
			else izpis += 'c';
			while(izvajaj && c != '*'){
				
			}
		}
	}

}
