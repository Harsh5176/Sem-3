public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=n ; j++){
                if(j==0 || j==i){
                    System.out.print("1 ");

                }else{
                    System.out.print((i-1)*(j-1)/(j-1)+" ");
                }
            }
        }
    }
}
