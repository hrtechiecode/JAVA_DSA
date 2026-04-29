package array;

public class Container_of_water {
        public static void main(String[] args) {

            // Sample input
            int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

            Solution sol = new Solution();
            int result = sol.maxArea(height);

            System.out.println("Maximum Water Area = " + result);
        }
    }

    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int width = j - i;
                    int h = Math.min(height[i], height[j]);
                    int area = width * h;
                    ans = Math.max(ans, area);
                }
            }
            return ans;
        }
    }

