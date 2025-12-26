import java.util.*;
public class UserInterface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of emails");
        int n=sc.nextInt();
        int emails[]=new int[n];
        System.out.println("Enter the spam scores");
        for(int i=0;i<n;i++){
            emails[i]=sc.nextInt();
            if(emails[i]<0){
                System.out.println("Negative scores are not allowed");
                return;
            }

        }

        for(int i=0;i<n;i++){
            if(emails[i]>50){
                emails[i]+=10;
            }
            else{
                emails[i]-=5;
            }
        }




        Map<Integer,Integer>unique=new HashMap<>();

        for(int x:emails){
            unique.put(x,unique.getOrDefault(x, 0) + 1);
        }
        int sum=0;

        for(Map.Entry<Integer,Integer>entry:unique.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }


        if(sum==0){
            System.out.println("No unique scores found after modification");
        }
        else{
            System.out.println(sum);
        }





    }

}
