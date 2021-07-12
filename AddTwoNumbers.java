class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode res = new ListNode(0);
        ListNode head = res;
        int c = 0;
        while(l1!=null && l2!=null) {
            head.next = new ListNode((l1.val+l2.val+c)%10);
            head = head.next;
            c = (l1.val+l2.val+c)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1==null) {
                while(l2!=null){
                    head.next = new ListNode((l2.val+c)%10);
                    c=(l2.val+c)/10;
                    l2 = l2.next;
                    head = head.next;
                }
        }
        if(l2==null) {
                while(l1!=null){
                    head.next = new ListNode((l1.val+c)%10);
                    c=(l1.val+c)/10;
                    l1 = l1.next;
                    head = head.next;
                }
        }
        if(c>0)
            head.next = new ListNode(c);
        return res.next;
    }
}