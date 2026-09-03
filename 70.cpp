class Solution {
public:
    int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev=1,curr=1;
        for (int i=2;i<=n;i++){
            int temp=curr;
            curr=prev+curr;
            prev=temp;
        }

        return curr;
    }
};
#include <iostream>
using namespace std;
int main() {
    Solution solution;
    int n = 5; // Example input
    int result = solution.climbStairs(n);
    std::cout << "Number of ways to climb " << n << " stairs: " << result << std::endl;
    return 0;
}
