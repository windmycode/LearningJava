/*
3����д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������
*/
class Test08_Exer3{
	public static void main(String[] args){
		//1������������������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("������num1��");
		int num1 = input.nextInt();
		
		System.out.print("������num2��");
		int num2 = input.nextInt();
		
		System.out.print("������num3��");
		int num3 = input.nextInt();
		
		//2���ж�
		/*
		����������6�����
		num1 <= num2 <= num3
		num1 <= num3 <= num2
		
		num2 <= num1 <= num3
		num2 <= num3 <= num1
		
		num3 <= num2 <= num1
		num3 <= num1 <= num2
		*/
		if(num1<=num2 && num2<=num3){
			System.out.println(num1 + "<=" +  num2 + "<=" +  num3);
		}else if(num1<=num3 && num3<=num2){
			System.out.println(num1 + "<=" +  num3 + "<=" +  num2);
		}else if(num2<=num1 && num1<=num3){
			System.out.println(num2 + "<=" +  num1 + "<=" +  num3);
		}else if(num2<=num3 && num3<=num1){
			System.out.println(num2 + "<=" +  num3 + "<=" +  num1);
		}else if(num3<=num2 && num2<=num1){
			System.out.println(num3 + "<=" +  num2 + "<=" +  num1);
		}else{
			System.out.println(num3 + "<=" +  num1 + "<=" +  num2);
		}
		
	}
}