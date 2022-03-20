class Solution
{
public:
    char findTheDifference(string s, string t) {
        map<char,int> mp;
        for(auto i:s){
            mp[i]++;
        }
        map<char,int> mp2;
        for(auto i:t){
            if(mp[i]==0){
                return i;
            }
            mp[i]--;
        }
        for(auto i:t){
            if(mp[i]<0){
                return i;
            }
        }
        return ' ';
    }
};