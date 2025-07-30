class FileSystem {

    HashMap<String,Integer> fileValues;

    public FileSystem() {
        fileValues = new HashMap<>();
    }
    
    public boolean createPath(String path, int value) {
        if(path.isEmpty()){
            return false;
        }

        if(fileValues.containsKey(path)){
            return false;
        }

        String currParent = path.substring(0,path.lastIndexOf("/"));

        if(currParent.length() > 1 && !fileValues.containsKey(currParent)){
            return false;
        }

        fileValues.put(path,value);
        return true;
        
    }
    
    public int get(String path) {
        return fileValues.getOrDefault(path,-1);
    }
}
//Time complexity: O(1)
//Space complexity: O(n)



/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */