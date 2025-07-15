class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;

        int maxSpeed = 0;

        //find max pile size because max size is max speed for koko to eat all bananas
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }

        //Binary Search
        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if(canEatInTime(piles, h, mid))
                maxSpeed = mid;
            else
                minSpeed = mid + 1;
        }

        return minSpeed;
    }

    private boolean canEatInTime(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += (int) Math.ceil((double) pile/speed);
        }
        return hours <= h;
    }
}