package qsp;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			      String a = "SOECCER";
			      char[] c = a.toCharArray();
			      System.out.println("The string is:" + a);
			      System.out.print("Duplicate Characters in above string are: ");
			      for (int i = 0; i < a.length(); i++) {
			         for (int j = i+1; j < a.length(); j++) {
			            if (c[i] == c[j]) {
			               System.out.print(c[j] + " ");
			               

	}

}
}
	}
}