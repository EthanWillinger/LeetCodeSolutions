class Solution {
public:
    bool isPalindrome(string s) {
        string s1;

        for (char c : s) {
            if (c >= 97 && c <= 122) {
                s1 += c;
            }

            else if (c >= 65 && c <= 90) {
                s1 += (c + 32);
            }

            else if (c >= '0' && c <= '9') {
                s1 += c;
            }
        }

        int j = s1.length() - 1;
        for (int i = 0; i < s1.length()/2; i++) {
            if (s1[i] != s1[j]) {
                return false;
            }

            j -= 1;
        }

        return true;
    }
};
