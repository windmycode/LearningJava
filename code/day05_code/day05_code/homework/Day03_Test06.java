class Day03_Test06{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�����뷽�̵Ĳ���a��");
		double a = input.nextDouble();
		
		System.out.print("�����뷽�̵Ĳ���b��");
		double b = input.nextDouble();
		
		System.out.print("�����뷽�̵Ĳ���c��");
		double c = input.nextDouble();
		
		if(a!=0){
			double d = b*b - 4*a*c;
			if(d>0){
				double x1 = (-b + Math.sqrt(d))/(2*a);
				double x2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println("�����⣺x1 = " + x1 + ",x2 = " + x2);
			}else if(d==0){
				double x = -b/(2*a);
				System.out.println("һ���⣺x = " + x);
			}else{
				System.out.println("��ʵ����Χ���޽�");
			}
		}else if(a==0 && b!=0){
			double x = -c/b;
			System.out.println("һ���⣺x = " + x);
		}else{
			System.out.println("���Ƿ���");
		}
	}
}