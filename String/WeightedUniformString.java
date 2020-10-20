static String[] weightedUniformStrings(String s, int[] queries) {
    s = s.toUpperCase();
    HashSet<Character> mapper = new HashSet<>();
    HashMap<Character, Integer> lookup = new HashMap<>();
    for (int i=0; i< 26; i++){
        lookup.put((char)(i+65), (i+1));
    }
    int[] weight = new int[s.length()];
    List<Integer> weigths = new ArrayList<>();
    for (int i = 0; i<s.length(); i++){
        if (mapper.contains(s.charAt(i))){
            if (s.charAt(i) == s.charAt(i-1)) {
                weight[i] = lookup.get(s.charAt(i)) + weight[i-1];
                weigths.add(weight[i]);
            }
        } else {
            mapper.add(s.charAt(i));
            weight[i] = lookup.get(s.charAt(i));
            weigths.add(lookup.get(s.charAt(i)));
        }
    }
    String[] result = new String[queries.length];
    for(int i = 0; i<queries.length; i++){
        if(weigths.contains(queries[i])) {
            result[i] = "Yes";
        } else {
            result[i] = "No";
        }
    }
    return result;
}
