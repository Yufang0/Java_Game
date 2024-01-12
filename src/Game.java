import java.util.*;
//猜單字(皆大寫) //備註:位置及字母皆正確，以*備註；僅字母正確，以'備註;甚麼都不是的話，不用備註
public class Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		String word[]= {"APPLE","YELLOW","TRAIN","CHAIR","DEEAM","MUSIC","ELEPHANT","AIRPLANE","APARTMENT","AUTUMN","BEE","BIRTHDAY","BOOKSTORE","CAMERA","CHOCOLATE","COOKIE","DANCE","FRUIT","GLASS","LEMON"};
		char[] QWORD; //存放題目
		char[] AWORD; //存放答案
		boolean ok=false; boolean ok1=false;
		
		
		QWORD = Qword(word).toCharArray();//隨機挑取word裡的單字作為題目
		for(int i=0;i<QWORD.length;i++)
			System.out.print(QWORD[i]);
		System.out.println();
		
		do {
			alphaprint(alphabet);//列出尚可選的字母
			Qwordprint(QWORD); //出題
			do{ //輸入與底線相同數量字母的單字，如長度不同再輸一次。
				AWORD = sc.nextLine().toCharArray();
				ok = check(QWORD,AWORD,alphabet);
			}while(!ok) ;
			//System.out.print("g");
			AQwordcompare(QWORD,AWORD,alphabet);
		}while(check2(QWORD,AWORD));
		
		
	}
	public static void alphaprint(char a[]) {
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
	public static boolean check(char q[],char a[], char alpha[]) {
		if(q.length!=a.length) //長度不相同，直接回傳false
			return(false);
		for(int i=0;i<a.length;i++)
			for(int j=0;j<26;j++) {
				if(a[i]==alpha[j]) //如果字母表裡目前還有此字母
					return(true); //回傳 true
			}
		return(false); //如果迴圈完整跑完都沒發現有此字母，則回傳 false
	}
	public static boolean check2(char q[],char a[]) {
		for(int i=0;i<a.length;i++) 
			if(a[i]!=q[i])
				return false;
		return true;
	}
	
	public static void AQwordcompare(char q[],char a[], char alpha[]){
		int l =q.length;
		for(int i=0;i<l;i++) {
			boolean ok = false;
			for(int j=0;j<l;j++) {
				if(a[i]==q[j]) {//當儲存格內容相同，代表數子猜對，最少得 1B
					if(i==j)
						System.out.print(a[i]+"* ");//位置及字母皆正確，以*備註。
					else
						System.out.print(a[i]+"' "); //僅字母正確，以'備註。
					ok = true;
					continue;
				}
				
			}
			if(!ok) {
				System.out.print(a[i]+" "); //甚麼都不是的話，不用備註。
				for(int r=0;r<26;r++) {
					if(a[i]==alpha[r])
						alpha[r]="-".charAt(0);continue;
				}
			}
		}
		System.out.println();
	}
}
