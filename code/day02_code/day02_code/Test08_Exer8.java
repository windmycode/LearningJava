class Test08_Exer8{
	public static void main(String[] args){
		short s = 5;
		//s = s-2;   //short - int�������int     
		
		byte b = 3;
      //  b = b + 4;    //byte + int�������int         
        b = (byte)(b+4);   //���� 
		
		char c = 'a';
		int  i = 5;
		float d = .314F;//�Ǳ�׼д�����������������0������ʡ��0��������ʡ��С����
		double result = c+i+d;   //char + int + float�������float��Ȼ���Զ�����Ϊdouble  
		
		
		byte b = 5;
		short s = 3;
		short t = s + b;  //short + byte�������int
	}
}