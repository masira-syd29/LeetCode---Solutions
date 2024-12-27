public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int maxArea = 0;
        int i=0, j=height.length-1;

        while(i<j){
            int area = Math.min(height[i], height[j]) *(j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
