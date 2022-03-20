class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
        if(k%n==0){
            return;
        }
        int v=k%n;
        vector<int> temp;
        for(int i=v;i<n;i++){
            temp.push_back(nums.at(i));
        }
        for(int i=0,j=0;i<n;i++){
            if(i<v){
                nums.at((i+v)%n)=nums.at(i);
            }
            else {
                nums.at((i+v)%n)=temp.at(j);
                j++;
            }
        }
    }
};