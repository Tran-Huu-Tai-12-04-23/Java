
public class Exercise08{
    public static int a(int n){
        int s = 0;
        for(int i = 1; i<=n ; i++)
        {
            s += i;
        }
        return s;
    }
    public static int b(int n){
        int s = 1;
        for(int i = 1; i <= n ; i++)
        {
            s *= i;
        }
        return s;
    }
    public static int c(int n){
        int s = 0;
        for(int i=0;i<=n;i++){
            s += Math.pow(2,i);
        }
        return s;
    }
    public static double d(int n){
        double s = 0;
        for(int i=1;i<=n;i++)
        {
            s += 1.0/(i+i);
        }
        return s;
    }
    public static int e(int n){
        int s = 0;
        for(int i=1;i<=n;i++)
        {
            s+= Math.pow( i , 2);
        }
        return s;
    }
    public static void main(String[] args){
        int n = 10 ;
        System.out.println(" a : S =  " + a(n));
        System.out.println(" b : S =  " + b(n));
        System.out.println(" c : S =  " + c(n)); 
        System.out.println(" d : S =  " + d(n));
        System.out.println(" e : S =  " + e(n));

    }


}