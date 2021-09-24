
public class ArraysKT {

	public static void main(String[] args) {
	
		int a[] [] = new int[3] [3];
		a[0][0] = 1;
		
		
		int b[][] = {{9,2,3},{4,0,1},{7,28,19}};
		
		int max = b[0][0];
		int descol=0;
		int min = b[0][descol];
		
		for(int i=0;i<3;i++) {
			
			
			for(int j=0;j<3;j++) {
				
				if(b[i][j]>max) {
					max =b[i][j];
					descol =j;
					
				}
//				System.out.print("\t");
				
			}
			
		}
		System.out.println(descol);
//		System.out.println(max);
		for(int i=0;i<3;i++) {
			
			for(int j=descol;j<=descol;j++) {
				
				if(b[i][j]<min) {
					min=b[i][j];
					
				}
				
				
			}
			
		}
		System.out.println(min);
	}

}
