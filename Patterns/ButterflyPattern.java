public class ButterflyPattern{

    public static void butterflyPattern(int n){
        //Top part
        for (int i = 1; i <= n; i++){		
			for(int j = 1; j <= (n*2); j++){	
				if(j<=i){
					System.out.print("*");
				}else if((i+j) >= (n*2)+1){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		//Bottom part
		for (int i = n; i >= 1; i--){		
			for(int j = 1; j <= (n*2); j++){	
				if(j<=i){
					System.out.print("*");
				}else if((i+j) >= (n*2)+1){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
    }
	public static void main(String args[]){
		int n = 4;
		butterflyPattern(n);

	}
}
