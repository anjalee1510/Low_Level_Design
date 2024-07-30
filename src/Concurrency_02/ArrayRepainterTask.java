package Concurrency_02;

public class ArrayRepainterTask implements Runnable{
	private final int[][] array;
	private final int startRow;
	private final int endRow;
	private final int startCol;
	private final int endCol;
	
	public ArrayRepainterTask(int[][] array,int startRow,int endRow,int startCol,int endCol) {
		this.array=array;
		this.startRow=startRow;
		this.endRow=endRow;
		this.startCol=startCol;
		this.endCol=endCol;
	}
	
	@Override
	public void run() {
		// Simulate repainting for the specified quadrant
		for(int i= startRow;i<=endRow;i++) {
			for(int j=startCol;j<=endCol;j++) {
				array[i][j]=array[i][j]*2; //Repaint by doubling the values
			}
		}
	}

}
