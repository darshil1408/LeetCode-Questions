class Solution {
public:
    void postorderTraversalHelp(vector<int> &order,TreeNode* node){
        if(!node){
            return;
        }
        postorderTraversalHelp(order,node->left);
        postorderTraversalHelp(order,node->right);
        
        
        order.push_back(node->val);
    }
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> order;
        postorderTraversalHelp(order,root);
        return order;
    }
};