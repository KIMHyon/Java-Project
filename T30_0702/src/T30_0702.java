
public class T30_0702 {
	public static int Test() {
		int a6=10;
		return a6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		System.out.println("==============1");
		if(a%2==0) {
			System.out.println("是双数");
		}else {
			System.out.println("是单数");
		}	
		int a1=96;
		System.out.println("===============3");
		if(a1>=90) {
			if(a1>=95) {
		System.out.println("A+");
	}
		}
		int a2=2;
		System.out.println("=============4");
		switch(a2%2){
		 case 0:
				System.out.println("是双数");
			
		 case 1:
				System.out.println("是单数");
		
		}
		int a9,b,c;
		b=10;
		c=5;
		System.out.println("==========5");
		switch(a9='*') {
		case '+':
			a9= b+c;
			System.out.println(b+"+"+c+"="+a9);
			break;
		case '-':
			a9= b-c;
			System.out.println(b+"-"+c+"="+a9);
			break;
		case '*':
			a9= b*c;
			System.out.println(b+"*"+c+"="+a9);
			break;
		case '/':
			a9= b/c;
			System.out.println(b+"/"+c+"="+a9);
			break;
		}
		System.out.println("=============6");
		for(int a3=0;a3<10;a3++){
			System.out.print(a3);
		}
		
		System.out.println("\n=============7");
		int i,j;
		for(i=2;i<5;i++) {
			for(j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("\n");
		}
		System.out.println("=============8");
		int a4=0;
		while(a4<10) {
			System.out.print(a4);
			a4++;
		}
		System.out.println("\n=============9");
		int i1,j1;
		i1=5;
		while(i1<10) {
			j1=1;
			while(j1<10) {
				System.out.println(i1+"*"+j1+"="+i1*j1);
				j1++;
			}
			i1++;
			System.out.println("\n");
	}
		System.out.println("=============10");
		int num;
		for(num=0;num<26;num++) {
			System.out.print((char)('a'+num));
	}
		System.out.println("\n=============11");
		int i4,sum;
		i4=1;
		sum=1;
		while(true) {
			System.out.println("i ="+i4 +"  sum ="+sum);
			i4++;
			sum+=i4;
			if(sum==15)break;
		}
		System.out.println("=============12");
		int i5,sum1 = 0;
		for(i5=1;i5<=10;i5++) {
			if(i5%2==1)continue;
			else sum1 += i5;
			System.out.print(i5+"\t");
		}
		System.out.println("\n从1到10的双数和是="+sum1);
		System.out.println("=============13");
		System.out.println("return Test:"+Test());
		System.out.println("=============14");
		int i7,j7;
		for(j7=1;j7<10;j7++) {
			for(i7=1;i7<10;i7++) {
				System.out.print(i7+"*"+j7+"="+i7*j7+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("=============15");
		int i8,j4;
		for(i8=1;i8<10;i8++) {
			for(j4=1;j4<10;j4++) {
				System.out.print(i8+"*"+j4+"="+i8*j4+"\t");
			}
		System.out.println("\n");
		}
	}
}
