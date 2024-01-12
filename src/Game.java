import java.util.*;
//猜單字
public class Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String word[]= {"APPLE","YELLOW","TRAIN","CHAIR","DEEAM","MUSIC","ELEPHANT","AIRPLANE","APARTMENT","AUTUMN","BEE","BIRTHDAY","BOOKSTORE","CAMERA","CHOCOLATE","COOKIE","DANCE","FRUIT","GLASS","LEMON"};
		Qwordprint(Qword(word));
	}
	public static String Qword(String w[]) {
		int n = (int)(Math.random()*w.length);
		return w[n];
	}
	public static void Qwordprint(String w) {
		int len = w.length();
		//System.out.println(w); //印出題目單字，驗證其長度與底線數量是否相同
		System.out.print("Please guess a word ");
		for(int i=0;i<len;i++) 
			System.out.print("_ ");
		System.out.println(":");
		
	}
}
