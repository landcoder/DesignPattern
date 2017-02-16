package com.mustang.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Desc
 * Created by Mustang on 17/2/16.
 */
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * 添加子节点
     * @param child
     */
    public void add(TreeNode child) {
        children.add(child);
    }

    /**
     * 移除子节点
     * @param child
     */
    public void remove(TreeNode child) {
        children.remove(child);
    }

    /**
     * 获取子节点
     * @return
     */
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

}
