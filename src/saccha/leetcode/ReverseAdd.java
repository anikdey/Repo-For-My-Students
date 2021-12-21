package linkedList.problems;

import java.util.Stack;

public class ReverseAdd {
    ListNode l1;
    ListNode l2;
    ListNode tailL1;
    ListNode tailL2;

    public void addL1(int data){
        ListNode n = new ListNode(data,null);
        if (l1==null){
            l1 = n;
        }else {
            tailL1.next = n;
        }
        tailL1 = n;
    }

    public void addL2(int data){
        ListNode n = new ListNode(data,null);
        if (l2==null){
            l2 = n;
        }else {
            tailL2.next= n;
        }
        tailL2 = n;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder list1 = new StringBuilder();
        StringBuilder list2 = new StringBuilder();

        ListNode temp1 = l1;
        while (temp1!=null){
            list1.append(temp1.val);
            temp1=temp1.next;
        }
        ListNode temp2 = l2;
        while (temp2!=null){
            list2.append(temp2.val);
            temp2 = temp2.next;
        }
        list1.reverse();
        list2.reverse();

        char[] c1 =list1.toString().toCharArray();
        char[] c2 = list2.toString().toCharArray();

        String s = numString(c1,c2);
        ListNode head = null;
        ListNode tail = null;

        for (int i =s.length()-1;i>=0;i--){
            int change = Integer.parseInt(String.valueOf(s.charAt(i)));
            ListNode listNode = new ListNode(change,null);
            if (head==null){
                head=listNode;
            }else{
                tail.next = listNode;
            }
           tail = listNode;
        }
        return head;
    }
    public String numString(char[] arr1,char[] arr2){
        Stack<Integer> stack = new Stack<>();
        int first =arr1.length-1;
        int second = arr2.length-1;
        int index =0;
        boolean check =false;


        while (first>=0&&second>=0){
            int c1=Integer.parseInt(String.valueOf(arr1[first]));
            int c2=Integer.parseInt(String.valueOf(arr2[second]));
            int sum =c1+c2;
            if (check){
                sum+=1;
            }
            if (sum>=10){
                check=true;stack.push(sum-=10);
            }else {
                check = false;stack.push(sum);
            }
            first--;second--;index++;
        }
        while (index< arr1.length){
            int sum =Integer.parseInt(String.valueOf(arr1[first]));
            if (check){
                sum+=1;
            }
            if (sum>=10){
                check=true;stack.push(sum-=10);
            }else {
                check = false;stack.push(sum);
            }
            index++;first--;
        }
        while (index< arr2.length){
            int sum =Integer.parseInt(String.valueOf(arr2[second]));
            if (check){
                sum+=1;
            }
            if (sum>=10){
                check=true;stack.push(sum-=10);
            }else {
                check = false;stack.push(sum);
            }
            index++;second--;
        }
        String output ="";
        if (check){
            output+="1";
        }

        while (!stack.isEmpty()){
            output+=stack.pop().toString();
        }
        return output;
    }
    
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }
    }
}
