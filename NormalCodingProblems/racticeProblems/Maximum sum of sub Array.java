/*/
MAximum sum of sub array 
/*/ 
public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
      
      int [] arr= {-34, -50, -42, -14, -5, -86};
      int n=6;
      int AnsSum=Integer.MIN_VALUE;
      for (int i=0; i<n;i++ ){
          int sum=0;
          for(int j=i;j<n; j++){
              sum=sum+arr[j];
              if(sum>AnsSum){
                  AnsSum=sum;
              }
          }  
      }
      System.out.println("max Sum of the sub array is = " + AnsSum);
    }
  ----------------------------------------------------------------------------------------------------------------------------------------------------



  
