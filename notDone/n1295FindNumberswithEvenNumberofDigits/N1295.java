package n1295FindNumberswithEvenNumberofDigits;
//共用時9分鐘
public class N1295 {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
        	int digits = 1;
        	while ((nums[i] /10 )!=0) {//除10直到剩個位數
				digits++;
				nums[i] /=10 ;
			}
			if (digits%2==0) {//位數為偶數則++
				result++;
			}

		}
        return result;
    }
}
