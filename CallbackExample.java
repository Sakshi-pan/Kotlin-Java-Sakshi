package reactive.ReactiveProgram;
interface Callback{
	void onComplete(String result);
}
class Task{
	void execute(Callback callback) {
		String result="Task Completed!";
		callback.onComplete(result);
	}
}
public class CallbackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task=new Task();
		Callback callback=new Callback() {
			public void onComplete(String result) {
				System.out.println("Callback: "+result);
			}
		};
		task.execute(callback);

	}

}
