class Solution
{
public:
    int removeDuplicates(vector<int>& nums) {
        map<int,int> mp;
        for(auto i:nums){
            mp[i]++;
        }
        int k=0;
        int x,j=0;
        for(auto i:mp){
            if(i.second<2){
                k+=i.second;
            }
            else{
                k+=2;
            }
            for(;j<k;j++){
                nums[j]=i.first;
            }
        }
        return k;
    }
};