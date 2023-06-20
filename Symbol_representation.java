public class Symbol_representation {

    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for( int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        int h = 4;
        for(int i =0; i<h; i++){
            for( int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
