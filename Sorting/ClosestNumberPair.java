static int[] closestNumbers(int[] arr) {
    if (arr.length <= 1){
        return arr;
    }
    Arrays.sort(arr);
    int min = arr[1] - arr[0];
    for (int i = 2; i<arr.length;i++) {
        min = Math.min(min, (arr[i] - arr[i-1]));
    }
    int count = 0;
    for (int i =1; i < arr.length;i++) {
        if (min == (arr[i]-arr[i-1])){
            count += 1;
        }
    }
    int[] result = new int[count*2];
    int j = 0;
    for (int i = 1; i<arr.length; i++) {
        if (min == (arr[i]-arr[i-1])){
            result[j] = arr[i-1];
            result[j+1] = arr[i];
            System.out.println(j);
            j+=2;
        }
    }
    return result;
}
