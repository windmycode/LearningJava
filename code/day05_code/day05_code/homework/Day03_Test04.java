//�������Ӽ����������գ��ж�����
class Day03_Test04{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�£�");
		int month = input.nextInt();
		
		System.out.print("�գ�");
		int day = input.nextInt();
		
		//(1)ˮƿ��
		if(month==1 && day>=20 || month==2 && day<=18){
			System.out.println("ˮƿ��");
		}else if(month==2 && day>=19 || month==3 && day<=20){
			System.out.println("˫����");
		}else if(month==3 && day>=21 || month==4 && day<=19){
			System.out.println("������");
		}else if(month==4 && day>=20 || month==5 && day<=20){
			System.out.println("��ţ��");
		}else if(month==5 && day>=21 || month==6 && day<=21){
			System.out.println("˫����");
		}else if(month==6 && day>=22 || month==7 && day<=22){
			System.out.println("��з��");
		}else if(month==7 && day>=23 || month==8 && day<=22){
			System.out.println("ʨ����");
		}else if(month==8 && day>=23 || month==9 && day<=22){
			System.out.println("��Ů��");
		}else if(month==9 && day>=23 || month==10 && day<=22){
			System.out.println("��ƽ��");
		}else if(month==10 && day>=24 || month==11 && day<=22){
			System.out.println("��Ы��");
		}else if(month==11 && day>=23 || month==12 && day<=21){
			System.out.println("������");
		}else if(month==12 && day>=22 || month==1 && day<=19){
			System.out.println("Ħ����");
		}
	}
}