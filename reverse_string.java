package qsp;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         String a= "Shaik Moinuddin";
         char[] b = a.toCharArray();
         for (int i = b.length - 1; i >= 0; i--)
             System.out.print(b[i]);
	}

}
