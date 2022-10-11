public class DebuggingExercise2 {

	private static int load = 1;
	public static void main(String[] args) {
		int i;
		int total;
		
		i = process(1);

		total = (i * 100) / load;
		if (load == 0)
			System.out.println("The value of total is infinity");
		else 
			System.out.println("The value of total is "+total);
	}

	private static int process(int step) {
		int i = 1;
		int result = step;
		for (; i <= 3; ++i) {
			result = result * i * step + step;
			if (result > 100) {
				load = 0;
				step = step - result;
			}
			else {
				load = load * result;
				++step;
			}
		}
		
		// What are the values of i, step, result, and load? result=93, i=4, step=4, load=1860
		return result;	
	}
}