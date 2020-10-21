static int[] serviceLane(int n, int[][] cases, int[] width) {
    if(width.length <= 0) {
        return null;
    }
    int entry,exit = 0;
    List<Integer> largestVehicle = new ArrayList<>();
    for (int i =0; i<cases.length;i++){
        //Assuming there are only 2 columns
        entry = cases[i][0];
        exit = cases[i][1];
        int min = width[entry];
        for (int j = entry+1; j<= exit; j++){
            min = Math.min(min, Math.min(width[j-1], width[j]));
        }
        largestVehicle.add(min);
    }
    int[] result = new int[largestVehicle.size()];
    int j = 0;
    for(Integer i : largestVehicle) {
        result[j] = i;
        j += 1;
    }
    return result;
}
