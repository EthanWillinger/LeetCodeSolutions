class Solution {
public:
    int firstUniqChar(string s) {
        if (s.length() == 1) {
            return 0;
        }
        //Array of pairs, each index represents a letter in the alphabet
        //freq[n].first is frequency of char, freq[n].second is the index in s
        pair <int, int> freq[26];

        //Set all values in freq to zero
        for (int i = 0; i < 26; i++) {
            freq[i].first = 0;
            freq[i].second = 0;
        }

        //Count frequency of chars in s and locate their indices
        for (int i = 0; i < s.length(); i++) {
            freq[s[i] - 97].first++;
            freq[s[i] - 97].second = i;
        }

        //Obtain size of array for use an argument to the C++ sort function
        size_t len = sizeof(freq)/sizeof(freq[0]);

        sort(freq, freq + len);

        for (auto a : freq) {

            if (a.first == 1) {
                return a.second;
            }
        }
        return -1;
    }
};
