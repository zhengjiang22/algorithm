package com.lyr.p02;

import java.util.List;

// @author zj

/**
 * 链表
 */
public class Test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 2;
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);
        
        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(node1, node2);
        System.out.println(listNode);
        
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        
        int carry = 0;
        while (l1 != null || l2 != null){
            int a = l1 != null? l1.val : 0; 
            int b = l2 != null? l2.val : 0; 
            
            int sum = a + b + carry;
            if(head == null){
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            carry = sum / 10;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
