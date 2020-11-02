static int hackerlandRadioTransmitters(int[] x, int k) {
    Arrays.sort(x);
    int noOfTransmitters = 0;
    int i=0;
    int length = x.length;
    while(i<length){
        noOfTransmitters++;
        int loc = x[i]+k;
        while(i<length && x[i] <= loc){
            i++;
        }
        loc = x[--i]+k;
        while(i<length && x[i]<=loc){
            i++;
        }
    }
    return noOfTransmitters;
}
