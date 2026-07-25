#include<iostream>
#include<vector>
// #include "TreeNode.h"
using namespace std;

class Solution {
public:
    void inorderTraversalHelp(vector<int> &order,TreeNode* node){
        if(!node){
            return;
        }
        inorderTraversalHelp(order,node->left);
        order.push_back(node->val);
        inorderTraversalHelp(order,node->right);
    }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> order;
        inorderTraversalHelp(order,root);
        return order;   
    }
};