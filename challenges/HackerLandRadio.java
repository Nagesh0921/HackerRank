// Complexity: O(nlogn)
static int hackerlandRadioTransmitters(int[] x, int k) {
        int len = x.length;
        //Sort Array
        Arrays.sort(x);
        int noOfTransmitter = 0;
        for(int i=0; i<len;){
            noOfTransmitter++;
            int location = x[i] + k;
            // Cover left side to distance K
            while(i<len && x[i]<=location){
                i++;
            }
            //update Location 
            location = x[--i] + k;
            //Cover right side to distance K
            while(i<len && x[i] <= location){
                i++;
            }
        }
        return noOfTransmitter;
    }
