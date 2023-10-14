class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n=plants.length;
        int steps=0,temp=capacity;
        for(int i=0;i<n;i++){
            if(plants[i]<=temp){
                steps++;
                temp-=plants[i];
            }
            else{
                steps+=(2*i)+1;
                temp=capacity-plants[i];
            }
        }
        return steps;
    }
}