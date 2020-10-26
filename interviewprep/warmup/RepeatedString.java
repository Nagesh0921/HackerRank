static long repeatedString(String s, long n) {
    if(s == null){
        return 0L;
    }
    int length = s.length();
    int noOfA = 0;
    for(int i=0; i<length;i++){
        if(s.charAt(i)=='a'){
            noOfA += 1;
        }
    }
    long divisor = n/length;
    long remainder = n%length;
    long result = noOfA * divisor;
    int i=0;
    if(remainder!=0) {
        while(remainder > 0){
            if(s.charAt(i) == 'a'){
                result += 1;
            }
            remainder--;
            i++;
        }
    }
    return result;
}
