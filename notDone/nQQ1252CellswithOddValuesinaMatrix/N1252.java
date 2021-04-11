package nQQ1252CellswithOddValuesinaMatrix;
//想了30分鐘放棄

public class N1252 {
    public static int oddCells(int m, int n, int[][] indices) {
    	int[][] result = new int[m][n];
    	for (int[] indice : indices) {
    		int row = indice[0],col = indice[1];
    		System.out.println(row);
		}
    	
    	int odd = 0;
        return odd;
    }
    
    public static void main(String[] args) {
		int[][] indices = {{0,1},{2,3}};
		int m =2;
		int n =3;
		oddCells(m, n, indices);
	}
	
}
