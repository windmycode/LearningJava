class Test08_Exer6{
	public static void main(String[] args){
        int no = 10;
        String str = "abcdef";
        String str1 = str + "xyz" + no;//abcdefxyz10
  
        str1 = str1 + "123";//abcdefxyz10123
        char c = '��';
  
        double pi = 3.1416;
        str1 = str1 + pi;//abcdefxyz101233.1416
		
        boolean b = false;
        str1 = str1 + b;//abcdefxyz101233.1416false
        str1 = str1 + c;//abcdefxyz101233.1416false��
 
 	    System.out.println("str1 = " + str1);		
	}
}