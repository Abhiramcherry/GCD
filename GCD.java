public static GCD{
	public static int find GCD(int a ,int b){
		if(b==0){
			return a;
		}
		return find GCD(b,a%b);
	}
	public static void main(String[] args){
		int num1=10;
		int num2=20;
		int gcd=find GCD(num1,num2)
			System.out.println("The GCD of"+num1+"and"+num2+"is:"+gcd);
	}
}
