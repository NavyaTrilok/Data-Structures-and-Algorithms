class ParkingSystem {

    int bigRemaining;
    int mediumRemaining;
    int smallRemaining;

    public ParkingSystem(int big, int medium, int small) {

        bigRemaining = big;
        mediumRemaining = medium;
        smallRemaining = small;
        
    }
    
    public boolean addCar(int carType) {

        if(carType == 1){
            if(bigRemaining > 0){
                bigRemaining--;
                return true;
            }
            return false;
        }
        if(carType == 2){
            if(mediumRemaining > 0){
                mediumRemaining--;
                return true;
            }
            return false;
        }
        if(carType == 3){
            if(smallRemaining > 0){
                smallRemaining--;
                return true;
            }
            return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */