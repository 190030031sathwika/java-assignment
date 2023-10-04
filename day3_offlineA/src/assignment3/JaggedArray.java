package assignment3;

public class JaggedArray {

	public static void main(String[] args) {
		String[][] array1 = {
				{"sat", "JAVA", "C", "C++"},
				{"pat", "JAVA", "UNIX"},
				{"cat", "Linux", "Oracle"},
				{"bat", "RDMS", "C#", "ORACLE"}
				};
		for(int i=0;i<array1.length;i++) {
			if("cat".equals(array1[i][0]))
				for(int j=0;j<array1[i].length;j++)
					System.out.print(array1[i][j]+" ");
		}
	}

}
