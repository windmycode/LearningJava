/*
��֪һ����λ�������磺483������ô���������İ�λ��ʮλ����λ��
*/
class Test07_Exer4{
	public static void main(String[] args){
		int num = 483;
		
		int bai = num / 100;
		//int shi = num/10%10;
		int shi = num%100/10;
		int ge = num % 10;
		
		System.out.println(num + "�İ�λ��" + bai + "��ʮλ��" + shi +"����λ��" + ge);
	}
}