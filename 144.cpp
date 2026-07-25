class Solution {
public:
    void preorderTraversalHelp(vector<int> &order,TreeNode* node ){
        if(!node){
            return;
        }
        order.push_back(node->val);
        preorderTraversalHelp(order,node->left);
        preorderTraversalHelp(order,node->right);
        

    }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> order;
        preorderTraversalHelp(order,root);
        return order;
    }
};