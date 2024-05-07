package qsp;

public class Second_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int max =a[0]; int secmax =a[0];
		int a[]= {100,400,90,84,27,98,33,96};
		int max =a[0],secmax =a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
				
			}
			else if (a[i]>secmax)
			{
				secmax=a[i];
				
			}
			
		}
       System.out.println("maximun value :"+max);
       System.out.println("second maximun value:"+secmax);
	}

}
