// Complete the bigSorting function below.
static String[] bigSorting(String[] unsorted) {
    Arrays.sort(unsorted, new Comparator<String>(){
        public int compare(String a, String b) {
            return compareStringToInteger(a,b);
        }
    });
    return unsorted;
}

static int compareStringToInteger(String a, String b){
    if (a.length() > b.length()) {
        return 1;
    }
    if (b.length() > a.length()) {
        return -1;
    }
    for (int i=0; i<a.length();i++) {
        if ((int)a.charAt(i) > (int)b.charAt(i)){
            return 1;
        }
        if ((int)a.charAt(i) < (int)b.charAt(i)){
            return -1;
        }
    }
    return 0;
}
