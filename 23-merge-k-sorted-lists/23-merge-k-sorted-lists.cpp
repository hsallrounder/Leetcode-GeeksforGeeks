/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        vector<int> vec;
        for(int i=0;i<lists.size();i++){
            while(lists[i]!=NULL){
                vec.push_back(lists[i]->val);
                lists[i]=lists[i]->next;
            }
        }

        sort(vec.begin(),vec.end());

        ListNode* l=new ListNode();
        ListNode* temp_l=l;
        for(int i=0;i<vec.size();i++){
            ListNode *temp=new ListNode(vec[i]);
            temp_l->next=temp;
            temp_l=temp_l->next;
        }

        return l->next;
    }
};