// class Solution {
//     public boolean isSpecialArray(int[] nums) {
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums.length == 1) {
//                 return true;
//             }
//             if ((nums[i] % 2) == (nums[i + 1] % 2)) { 
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.isSpecialArray(new int[]{1}));          
//         System.out.println(solution.isSpecialArray(new int[]{2, 1, 4}));    
//         System.out.println(solution.isSpecialArray(new int[]{4, 3, 1, 6})); 
//     }
// }


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.check(new int[]{3, 4, 5, 1, 2})); // true
        System.out.println(solution.check(new int[]{2, 1, 3, 4}));    // false
        System.out.println(solution.check(new int[]{1, 2, 3}));       // true
    }
}