package p;


public class array {
	public static void main(String[] args) {
		int a[] = {1,4,6,8,9,4,6,7};
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]==a[j])
				{
			System.out.println(a[i]);
			}
		}
	
	}
	}
}
