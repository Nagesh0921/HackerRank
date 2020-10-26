static int sockMerchant(int n, int[] ar) {
    if(n <=1 ){
        return 0;
    }
    HashMap<Integer,Integer> mapper = new HashMap<>();
    for(int i=0; i<n; i++) {
        int count;
        if(mapper.containsKey(ar[i])){
            count = mapper.get(ar[i]) + 1;
            mapper.put(ar[i], count);
        } else {
            mapper.put(ar[i], 1);
        }
    }
    int result = 0;
    for(Map.Entry<Integer, Integer> entry : mapper.entrySet()){
        result = result + entry.getValue()/2;
    }
    return result;
}
