package SeleniumClass;

public class IncrementalandDecrementalOperator {

	public static void main(String[] args) {
		// POST Increment
		int a=1;
		int b=a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---------------------------------------------------");
		
		int i=-99;
		int j=i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------------------------------------------------");
		
		int num=500;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num--);
		System.out.println(num);
		System.out.println(--num);
		System.out.println("---------------------------------------------------");
		
		//PreIncrement
		int x=1;
		int y=++x;
		System.out.println((x));
		System.out.println(y);
		
		System.out.println("---------------------------------------------------");
		int m=-99;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("---------------------------------------------------");
		
		int num1=100;
		System.out.println("num1="+" "+ ++num1);
		System.out.println("num1="+" "+ num1);
		System.out.println("---------------------------------------------------");
		
		//PostIncrement
		int p=2;
		int r= p--;
		System.out.println(p);
		System.out.println(r);
		
		System.out.println("---------------------------------------------------");
		int s=-999;
		int t=s--;
		System.out.println(s);
		System.out.println(t);
		
		System.out.println("---------------------------------------------------");
		//PreDecrement
		int a1= 2;
		int b1=--a1;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println("---------------------------------------------------");
		
		//Character Increment
		char ch='a';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println("---------------------------------------------------");
		//0-9 Increment & Decrement
		char h='0';
		System.out.println((int)h++);
		System.out.println((int)h);
		System.out.println((int)++h);
		System.out.println((int)h);
		System.out.println((int)h--);
		System.out.println((int)h);
		System.out.println((int)--h);
		System.out.println((int)h);
		System.out.println("---------------------------------------------------");
		
		int pop = 1;
		pop = pop+1;
		System.out.println(pop);
		
		int p11 = pop+1;
		System.out.println(p11);
		System.out.println("---------------------------------------------------");
		
		byte f1 = 127;
		byte f2 = 127;
		
		int f3 = f1+f2;//2
		System.out.println(f3);
		
		System.out.println("---------------------------------------------------");
		//
		char gh = '1';//49
		System.out.println(gh++);//'1'+1 = '2'
		System.out.println(gh);
		
		System.out.println(10);
		
		char jj = 'z';//122
		System.out.println(++jj);//123
		
	}

}
