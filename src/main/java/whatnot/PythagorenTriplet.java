package whatnot;

public class PythagorenTriplet {

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 6, 5};
        PythagorenTriplet pythagorenTriplet = new PythagorenTriplet();
        pythagorenTriplet.verifyIfTripletPresnt(arr);
    }
//o(n3) time complexity
    private boolean verifyIfTripletPresnt(int[] ar) {
        int n=ar.length;
            for (int i=0; i<n; i++){
                for (int j=i+1; j<n; j++){
                    for (int k=j+1; k<n; k++){
                        int x = ar[i]*ar[i], y = ar[j]*ar[j], z = ar[k]*ar[k];
                        if (x == y + z || y == x + z || z == x + y)
                            return true;
                    }
                }
            }
            return false;
        }

    }

