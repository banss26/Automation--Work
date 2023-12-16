public class NumericalPattern2 {
public static void main(String[] args) {
	int i,j,k;
	for (i=9;i>=1;i--){		
		for (k=0;k<9-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}