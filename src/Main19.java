/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1  2  3  4 
					 *    5  6  7  8 
					 *    9  10 11 12 
					 *    13 14 15 16 �����δ�ӡ������
 * 						  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author User
 * ˼·������4���߽磬ע�⣡��ÿ���ж�ʱ��Ҫͬʱ�ж�min��max �����λ�ã���������һСʱ��������
 */

import java.util.ArrayList;
public class Main19 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5}};
		ArrayList<Integer> arr = new Solution19().printMatrix(a);
		for(int i : arr) {
			System.out.print(i+",");
		}
 	}

}
class Solution19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	int rowMin = 0,rowMax = matrix[0].length-1;
    	int columnMin = 0,columnMax = matrix.length-1;
    	int rowIndex = 0,colunmIndex = 0;
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	result.add(matrix[colunmIndex][rowIndex]);
    	while(true) {
    		while(rowIndex < rowMax&&columnMin<=columnMax) {
    		rowIndex++;    		
    		result.add(matrix[colunmIndex][rowIndex]);
    		}columnMin++;
    		while(colunmIndex<columnMax&&rowMin<=rowMax) {
    		colunmIndex++; 
    		result.add(matrix[colunmIndex][rowIndex]);
    		}rowMax--;
    		while(rowIndex > rowMin&&columnMin<=columnMax) {
    		rowIndex--;    		
    		result.add(matrix[colunmIndex][rowIndex]);
    		}columnMax--;
    		while(colunmIndex>columnMin&&rowMin<=rowMax) {
    		colunmIndex--; 
    		result.add(matrix[colunmIndex][rowIndex]);
    		}
    		rowMin++;
    		if(columnMin>columnMax&&rowMin>rowMax) break;
    	}
		return result;
       
    }
}
