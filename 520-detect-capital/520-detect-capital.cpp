class Solution {
public:
    bool detectCapitalUse(string word) {
        int small=0,cap=0;
        for(int i=0;i<word.size();i++){
            if(word.at(i)>='a' && word.at(i)<='z'){
                small++;
            }
            else{
                cap++;
            }
        }
        if(small==word.size()){
            return true;
        }
        if(cap==word.size()){
            return true;
        }
        if(word.at(0)>='A' && word.at(0)<='Z' && small==word.size()-1){
            return true;
        }
        return false;
    }
};