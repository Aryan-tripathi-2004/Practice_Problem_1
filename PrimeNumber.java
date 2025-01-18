class PrimeNumber{
		public static void main(String Args[]){
			
			System.out.println("Prime Numbers in Range 1-10 are: ");
			for(int i=1;i<=10;i++){
				int count = 0;
				for(int j=1;j<=i;j++){
					if(i%j==0) count++;
				}
				if(count==2) System.out.println(i);
			}
	}	
}
