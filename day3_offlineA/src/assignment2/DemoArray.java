package assignment2;

public class DemoArray {

	public static void main(String[] args) {
		int[][] firstArrayMatrix = {{1,1,1}, {1,1,1}};
		int[][] secondArrayMatrix = {{2,2,2}, {2,2,2}};
		
		System.out.println("Matrix 1");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print(firstArrayMatrix[i][j]+" ");
			System.out.println();
		}
		System.out.println("Matrix 2");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print(secondArrayMatrix[i][j]+" ");
			System.out.println();
		}
		System.out.println("Sum of the Matrices");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print((firstArrayMatrix[i][j]+secondArrayMatrix[i][j])+" ");
			System.out.println();
		}
	}
}
