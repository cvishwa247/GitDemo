
public class LoopsKT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=1;
//		for(int i=0;i<50;i=a-i) {
//			if(i<100) {
//				a=a+i;
//			}
//			System.out.println(a);
//		}

	
	int k=3;
	
	for(int i=1;i<4;i++) {
				
		for(int j=1;j<=i;j++) {
			
			System.out.print(k);
			System.out.print("\t");
			k=k+3;
		}
		System.out.println("");
	}

}}
