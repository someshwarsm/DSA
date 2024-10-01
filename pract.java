// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class pract {
    public static void main(String[] args) {
        int k=1000, n=1000, count=0;
        int temp=1;
        for(int i=0;i<k-1;i++){
            count++;
            System.out.print(temp+" ");
            if(temp*10 <= n)
                temp*=10;
            else{
                while(temp%10==9 || temp==n)
                    temp/=10;
                temp++;
            }
        }
        System.out.println("Count"+count);
    }
}