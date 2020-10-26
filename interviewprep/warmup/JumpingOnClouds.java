static int jumpingOnClouds(int[] c) {
    if(c != null && c.length <= 1){
        return 0;
    }
    int noOfJumps = 0;
    int length = c.length;
    int counter = 0;
    if(c[length-1] == 1) {
      return 0;
    }
    for(int i =0; i<length;) {
        counter = i;
        if(c[0] == 1) {
            counter += 2;
            if(counter<length && c[counter] == 0) {
                noOfJumps += 1;
            } else {
                counter += 1;
                if(counter<length && c[counter] == 0) {
                    noOfJumps += 1;
                } else {
                    counter += 1;
                    if(counter<length && c[counter] == 1) {
                        noOfJumps = 0;
                    }
                }
            }
        }
        if(i<length && c[counter] == 0){
            counter += 2;
            if(counter<length && c[counter] == 0) {
                noOfJumps += 1;
            } else {
                counter = counter - 1;
                if(counter<length && c[counter] == 0){
                    noOfJumps += 1;
                }
            }
        }
        i = counter;
    }
    return noOfJumps;
}
