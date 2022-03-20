class Solution {
    public int romanToInt(String s) {
        int res=0;
        if(s.charAt(0)=='M'){
            res += 1000;
        }
        else if(s.charAt(0)=='D'){
            res += 500;
        }
        else if(s.charAt(0)=='C'){
            res += 100;
        }
        else if(s.charAt(0)=='L'){
            res += 50;
        }
        else if(s.charAt(0)=='X'){
            res += 10;
        }
        else if(s.charAt(0)=='V'){
            res += 5;
        }
        else if(s.charAt(0)=='I'){
            res+=1;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='M'){
                if (s.charAt(i-1)=='C'){
                    res+=800;
                }
                else {
                    res += 1000;
                }
            }
            else if(s.charAt(i)=='D'){
                if (s.charAt(i-1)=='C'){
                    res+=300;
                }
                else {
                    res += 500;
                }
            }
            else if(s.charAt(i)=='C'){
                if (s.charAt(i-1)=='X'){
                    res+=80;
                }
                else {
                    res += 100;
                }
            }
            else if(s.charAt(i)=='L'){
                if (s.charAt(i-1)=='X'){
                    res+=30;
                }
                else{
                    res += 50;
                }
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i-1)=='I'){
                    res+=8;
                }
                else {
                    res += 10;
                }
            }
            else if(s.charAt(i)=='V'){
                if(s.charAt(i-1)=='I'){
                    res+=3;
                }
                else {
                    res += 5;
                }
            }
            else if(s.charAt(i)=='I'){
                res+=1;
            }
        }
        return res;
    }
}