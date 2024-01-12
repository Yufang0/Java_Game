import java.util.*;
//猜單字(皆大寫)
public class Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String word[]= {"APPLE","YELLOW","TRAIN","CHAIR","DEEAM","MUSIC","ELEPHANT","AIRPLANE","APARTMENT","AUTUMN","BEE","BIRTHDAY","BOOKSTORE","CAMERA","CHOCOLATE","COOKIE","DANCE","FRUIT","GLASS","LEMON"};
		char[] QWORD; //存放題目
		char[] AWORD; //存放答案
		boolean ok=false;
		
		alphaprint(alphabet);//列出尚未選過的字母
		QWORD = Qword(word).toCharArray();//隨機挑取word裡的單字作為題目
		Qwordprint(QWORD); //出題
		do{ 
			//輸入與底線相同數量字母的單字，如長度不同再輸一次。
			AWORD = sc.nextLine().toCharArray();
			ok = (QWORD.length==AWORD.length);
			System.out.println(QWORD.length+" "+AWORD.length);
		}while(!ok) ;
		System.out.print("g");
		
		
	}
	public static void alphaprint(String a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"   ");
			if(i%9==8)
				System.out.println("\n");
		}
		System.out.println("\n");
	}
	public static String Qword(String w[]) {
		int n = (int)(Math.random()*w.length);
		
		return w[n];
	}
	public static void Qwordprint(char w[]) {
		int len = w.length;
		//System.out.println(w); //印出題目單字，驗證其長度與底線數量是否相同
		System.out.print("Please guess a word ");
		for(int i=0;i<len;i++) 
			System.out.print("_ ");
		System.out.println(":");
	}
	public static void AQwordcompare(char q[],char a[], char alpha[]){
		
	}
}
