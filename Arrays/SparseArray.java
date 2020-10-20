static int[] matchingStrings(String[] strings, String[] queries) {
      int[] result = new int[queries.length];
      Map<String, Integer> dictionary = new HashMap<>();
      for(int i = 0; i< strings.length; i++) {
          int count = 1;
          if(dictionary.containsKey(strings[i])){
              count = 1 + dictionary.get(strings[i]);
              dictionary.put(strings[i], count);
          } else {
              dictionary.put(strings[i], count);
          }
      }
      for (int i=0; i< queries.length; i++) {
          if (dictionary.containsKey(queries[i])){
              result[i] = dictionary.get(queries[i]);
          } else {
              result[i] = 0;
          }
      }
      return result;
  }
