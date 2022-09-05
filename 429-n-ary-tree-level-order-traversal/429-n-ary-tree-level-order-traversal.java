/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new LinkedList<>();
        TreeMap<Integer,List<Integer>> mp=new TreeMap<>();
        BFS(root,mp,0,new LinkedList<>());
        for(List<Integer> l:mp.values()){
            ans.add(l);
        }
        return ans;
    }
    private void BFS(Node t_root,TreeMap<Integer,List<Integer>> mp,int level,Queue<Node> queue){
        if(t_root!=null){
            queue.add(t_root);
            if(!queue.isEmpty()){
                t_root = queue.poll();
                List<Integer> temp=mp.getOrDefault(level,new LinkedList<>());
                temp.add(t_root.val);
                mp.put(level,temp);
                List<Node> l = t_root.children;
                for(Node n:l){
                    BFS(n,mp,level+1,queue);
                }
            }
        }
    }
}