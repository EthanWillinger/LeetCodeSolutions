class Solution {
public:
    int fib(int n) {

        int result = 0;

        if (n == 0) {
            return result += 0;
        } 

        else if (n == 1) {
            return result += 1;
        } else {

            result = fib(n -1) + fib(n -2);
        }

        return result;
        
    }
};
