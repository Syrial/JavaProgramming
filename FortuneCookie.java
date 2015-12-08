import java.util.Random;

public class FortuneCookie{
	public static void main(String[] args){
		
		Random r = new Random();
		int Fnum = 1 + r.nextInt(16), 
			LottoNum1 = 1 + r.nextInt(99),
			LottoNum2 = 1 + r.nextInt(99),
			LottoNum3 = 1 + r.nextInt(99),
			LottoNum4 = 1 + r.nextInt(99),
			LottoNum5 = 1 + r.nextInt(99),
			LottoNum6 = 1 + r.nextInt(99);
			
		
		String FMsg = "";
		
		if(Fnum == 1)
			FMsg = "\"Seek and you shall find.\"";
		else if(Fnum == 2)
			FMsg = "\"No shadows but the ones in your heart.\"";
		else if(Fnum == 3)
			FMsg = "\"You'll never know what you will find when you turn a corner.\"";
		else if(Fnum == 4)
			FMsg = "\"The answer to life is 42.\"";
		else if(Fnum == 5)
			FMsg = "\"Apple a day keeps the doctor away.\"";
		else if(Fnum == 6)
			FMsg = "\"The answer to life is 42.\"";
		else if(Fnum == 7)
			FMsg = "\"Hatred only begets more hatred.\"";
		else if(Fnum == 8)
			FMsg = "\"Wind blows where the wind wills.\"";
		else if(Fnum == 9)
			FMsg = "\"It is better to work smart than to work hard.\"";
		else if(Fnum == 10)
			FMsg = "\"Caution is the better part of valour.\"";
		else if(Fnum == 11)
			FMsg = "\"Women is the far more dangerous of the 2 sexes.\"";
		else if(Fnum == 12)
			FMsg = "\"I must be dilligent and intelligent.\"";
		else if(Fnum == 13)
			FMsg = "\"There is no retreat, no fallback, no fear.\"";
		else if(Fnum == 14)
			FMsg = "\"Be strong and be clever.\"";
		else if(Fnum == 15)
			FMsg = "\"Do what you can and do what you must.\"";
		else if(Fnum == 16)
			FMsg = "\"Learn and never stop growing.\"";
		
		System.out.println("Fortune cookie says: " + FMsg);
		System.out.print("\t" + LottoNum1 + " - ");
		System.out.print(LottoNum2 + " - ");
		System.out.print(LottoNum3 + " - ");
		System.out.print(LottoNum4 + " - ");
		System.out.print(LottoNum5 + " - ");
		System.out.print(LottoNum6);
					
	}
}