class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        map<int,int> mp;
        for(auto i:nums1){
            for(auto j:nums2){
                mp[i+j]++;
            }
        }
        int ctr=0;
        for(auto i:nums3){
            for(auto j:nums4){
                ctr+=mp[-(i+j)];
            }
        }
        return ctr;
    }
};