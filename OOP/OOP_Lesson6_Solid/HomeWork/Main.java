public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister();
		Reporter report = new Reporter();
		report.report(user);
		persister.save(user);
	}
}