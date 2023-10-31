import static java.lang.Math.abs;

class Sort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 0, 4, 8,1,7};
        System.out.println(sorted(arr));}

        public static int sorted(int[] arr){
            int min=arr.length;
            for (int i = 0; i < arr.length; i++) {
                int key1= 0;
                for (int j = 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]&& i!=j) {
                        key1 = j - i;
                    }
                    if(key1<min&& key1!=0){
                        min=key1;
                    }
                }
                if(min==1)
                    break;
            }

            return abs(min);
        }
    }
