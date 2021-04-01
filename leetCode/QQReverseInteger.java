package leetCode;
//7. Reverse Integer
/*int的最大值2147483647，尾數是7，要列入判斷
 * ，最小值-2147483648，尾數是8，要列入判斷
 *  if 裡面return 0同時會跳出迴圈
*/
class QQReverseInteger {
    public int reverse(int x) {
    	int rev = 0;
    	while (x != 0) {
    		int pop = x%10;
    		x /= 10;
    		if(rev > Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && pop>7)) {return 0;}
    		if (rev < Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE&& pop<-8) ) {return 0;}
    			rev = rev *10 +pop;
		}
    	return rev;
    }
    public static void main(String[] args) {
		QQReverseInteger solution = new QQReverseInteger();
		System.out.println(solution.reverse(120));
		
	}
}

//DIY錯誤示範，別從字串去想，雖然前面題目都是字串反轉，從數學角度切入才對
//class QQReverseInteger {
//  public int reverse(int x) {
//  	int rev = 0;
//  	StringBuilder s = new StringBuilder();
//  	while (x != 0) {
//			int pop = x %10;
//			x /=10;
//  		rev = pop * 10;
//  		s.append(pop);
//		}
//  	System.out.println(s);
//  	return rev;
//  }
//  public static void main(String[] args) {
//		QQReverseInteger solution = new QQReverseInteger();
//		solution.reverse(123);
//				
//	}
//}
//不能轉負數，轉出來不是int，開頭是0也不能轉