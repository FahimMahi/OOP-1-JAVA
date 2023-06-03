import java.util.Scanner;
public class Array {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Press the array amount: ");
		int element= sc.nextInt();
		int array[]= new int[element];
		for(int i=0;i<element;i++){
		System.out.print("Press the int value: ");
		int input = sc.nextInt();
		array[i]=input;
	}
		System.out.println("To check if an array is empty you have to press 1");
		System.out.println("To print current array you have to press 2");
		System.out.println("To reverse an array you have to press 3");
		System.out.println("To check if a value is present in a array you have to press 4");
		System.out.println("To remove duplicates from an array you have to press 5");
		System.out.println("To remove any element of an array you have to press 6");
		System.out.println("To insert a value between two numbers you have to press 7");
		System.out.println("To get a random value you have to press 8");
		System.out.println("To suffle the elements you have to press 9");
		System.out.println("To sort array in ascending order you have to press 10");
		System.out.println("To sort array in descending order you have to press 11");
		System.out.println("To find min, max, sum and average you have to press 12");
		System.out.println("To move all the 0's to the end of an array you have to press 13");
		
		int num = 1;
		while(num>0){
			System.out.print("Enter number to check: ");
			int i = sc.nextInt();
			num=i;
			if(num==1){if(element==0){System.out.println("Empty Array");}
			else{System.out.println("This is not an empty array");}
			}
			if(num==2){for(int j=0;j<element;j++){
				System.out.print(array[j]+" ");}
			}
			if(num==3){
				for(int x=array.length-1;x>=0;x--){
					System.out.print(array[x]+" ");
				}
			}
			if(num==4){
				System.out.print("Enter any value to check if a value is present in a array");
				int k = sc.nextInt();
				for(int l=0;l<element;l++){
					if(array[l]==k){System.out.println("This value is present");}
				}
			}
			if(num==5){
				int c=0,d=1;
				while(c>element){
					if(array[c]==array[d]){
						array[c]=0;
						c++;
					}
				}
			}
			if(num==6){
				System.out.print("Enter any element number you want to remove of an array: ");
				int p= sc.nextInt();
				array[p]=0;
			}
			if(num==7){
				System.out.print("Enter two values you want to add another between them: ");
				int e= sc.nextInt();
				int f= sc.nextInt();
				int g=f-e;
				System.out.print("Enter value you want to add");
				int h= sc.nextInt();
				array[g]= h;
			}
			if(num==8){
				System.out.print("Enter any number between 1 to "+element+" = ");
				int m = sc.nextInt();
				System.out.println("Random value from the array is: "+array[m]);
			}
			if(num==9){
				int n=0,o=1,tempo;
				while(n<array.length){
					tempo=array[o];
					array[o]=array[n];
					array[n]=tempo;
					n++;
				}
			}
			if(num==10){
				for(int u=0;u<element;u++){
					for(int v=u+1;v<element;v++){
						int tempor;
						if(array[u]>array[v]){
							tempor = array[v];
							array[v] = array[u];
							array[u] = tempor;
						}
					}
				}
			}
			if(num==11){
				for(int w=0;w<element;w++){
					for(int uv=w+1;uv<element;uv++)
					{
						int temporary;
						if(array[w]<array[uv]){
							temporary= array[uv];
							array[uv]= array[w];
							array[w]=temporary;
						}
					}
				}
			}
			if(num==12){int r=0,s=1,min=1000,max=-1,sum=0,avg=0;
				for(int q=0;q<element;q++){
					if(array[q]<min){min=array[q];}
				}
				System.out.println("Minimum value: "+min);
				for(int t=0;t<element;t++){
					if(array[t]>max){max=array[t];}
				}
				System.out.println("Maximum value: "+max);
				while(r<array.length){
					sum= array[r]+sum;
					avg=sum/element;
					r++;
				}
				System.out.println("Sum of array:  "+sum);
				System.out.println("Average of array: "+avg);
				}
			if(num==13){int count=0;
			for(int x=0;x<element;x++){
			if(array[x] !=0){
				array[count++]=array[x];
			}
			}
			while(count<element){
				array[count++]=0;
			}
			for(int x=0;x<element;x++){
				System.out.println(array[x]);
			}
			}
			System.out.println("To stop you have to press 0");
		}
	}
}