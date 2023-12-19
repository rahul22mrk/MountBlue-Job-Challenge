public static String gridChallenge(List<String> grid) {
    // Write your code here
        for(int i=0; i<grid.size(); i++){
            char[] arr = grid.get(i).toCharArray();
            Arrays.sort(arr);
            grid.set(i , new String(arr));
        }
        
        for(int i=0; i<grid.get(0).length(); i++){
            for(int j=1; j<grid.size(); j++){
                if(grid.get(j).charAt(i) < grid.get(j-1).charAt(i)){
                    return "NO";
                }
            }
        }
        return "YES";

    }
