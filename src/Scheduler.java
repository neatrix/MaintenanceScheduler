import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
	
	public void check(){
		ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
		service.scheduleAtFixedRate( () -> {
			
			System.out.println("Sürekli calistiginin kanitidir.1 saniyeye ayarlidir.");
			Notifier obj= new Notifier();
			obj.methodNotifier();
		
		
		
		}, 0, 10L, TimeUnit.SECONDS);
	}

}
