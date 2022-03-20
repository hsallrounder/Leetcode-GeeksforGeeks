class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        if(arr.size()<3){
            return false;
        }
        if(arr.at(0)>arr.at(1)){
            return false;
        }
        bool dec=false;
        int i=0;
        for(;i<arr.size()-1;i++){
            if(arr.at(i)==arr.at(i+1)){
                return false;
            }
            if(!dec){
                if(arr.at(i)>arr.at(i+1)){
                    dec=true;
                }
            }
            else{
                if(arr.at(i)<arr.at(i+1)){
                    return false;
                }
            }
        }
        if(!dec && i<arr.size()){
            return false;
        }
        return true;
    }
};
