public static int countingValleys(int steps, String path) {
// Write your code here
    if(steps <= 1) {
        return 0;
    }
    int level = 0;
    int noOfValley = 0;
    int length = path.length();
    for(int i =0 ;i<length; i++) {
        if(path.charAt(i) == 'U') {
            ++level;
        }
        if(path.charAt(i) == 'D') {
            --level;
        }
        if(level == 0 && path.charAt(i) == 'U') {
            noOfValley++;
        }
    }
    return noOfValley;
}
