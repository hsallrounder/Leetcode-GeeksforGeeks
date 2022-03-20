class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max=0;
        for(auto i: accounts.at(0)){
            max+=i;
        }
        for(int i=1;i<accounts.size();i++){
            int temp=0;
            for(auto j:accounts.at(i)){
                temp+=j;
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
};