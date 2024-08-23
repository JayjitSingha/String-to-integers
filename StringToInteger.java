import java.util.Scanner;
public class StringToInteger{
    public static int[] stringToIntArr(String nums){
       String newnums="";
       int comma=0;
    for(int i=0;i<=nums.length()-1;i++){
        if(nums.charAt(i)==','){
            comma++;
       }
        if(nums.charAt(i)==' '){
            continue;
        }
            newnums+=nums.charAt(i);
    } 
        int[] locationOfComma=new int[comma+2];
        locationOfComma[0]=-1;
        locationOfComma[comma+1]=newnums.length();
        int sum=0;
        for(int i=0;i<=newnums.length()-1;i++){
            if(newnums.charAt(i)==','){
              sum++;
              locationOfComma[sum]=i;
           } 
    }
    int[] storeNum= new int[comma+1];
for(int i=0;i<=comma;i++){String valueAssign="";
for(int k=locationOfComma[i]+1;k<=locationOfComma[i+1]-1;k++){
valueAssign+=newnums.charAt(k);
}
storeNum[i]=Integer.valueOf(valueAssign);
}
 return storeNum;       
}
    public static void main(String[] args){
        System.out.println("Enter a list of numbers(separated by commas)");
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
      int fk[]=stringToIntArr(x);
int nw=fk[0];
int sum=0;
for(int i=0;i<fk.length;i++){
    if(fk[i]>=nw){
        nw=fk[i];
        sum++;
    }
}
if(sum==fk.length){
    System.out.println("The list is sorted in ascending order");
}
else{
    System.out.println("The list is not sorted in ascending order");
}
    }
}
