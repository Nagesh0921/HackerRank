static int[] rotLeft(int[] a, int d) {
    if(a==null && a.length < 1){
        return a;
    }
    int mod = d%a.length;
    if(mod == 0){
        return a;
    }
    int[] temp = new int[a.length];
    for(int i = 0; i<a.length; i++) {
        temp[i] = a[(i+mod)%a.length];
    }
    return temp;
}
