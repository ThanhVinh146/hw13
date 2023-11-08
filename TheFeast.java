public class TheFeast {
    public static void main(String[] args){
        System.out.println(theFeast(10,2,5));
        System.out.println(theFeast(12,4,4));
        System.out.println(theFeast(6,2,2));

    }
    public static int theFeast(int n,int c,int m){
        int total=n/c;
        int Remainingwrappers=0;
        int bonusBars;
            if(n>c){
        bonusBars=total/m;
        Remainingwrappers=total-m;
        total+=bonusBars+((bonusBars+Remainingwrappers)/m);
        return total;}
        else {
            return total=0;
        }
    }
}
