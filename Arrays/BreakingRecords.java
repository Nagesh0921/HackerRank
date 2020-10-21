static int[] breakingRecords(int[] scores) {
    HashMap<String,Integer> records = new HashMap<>();
    records.put("max", scores[0]);
    records.put("min", scores[0]);
    int maxCounter = 0, minCounter = 0;
    for (int i = 0; i<scores.length; i++) {
        if (records.get("max") < scores[i]) {
            maxCounter += 1;
            records.put("max", scores[i]);
        }
        if (records.get("min") > scores[i]) {
            minCounter += 1;
            records.put("min", scores[i]);
        }
    }
    int[] result = {maxCounter, minCounter};
    return result;
}
