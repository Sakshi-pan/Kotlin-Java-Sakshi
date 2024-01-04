package Flux;
import reactor.core.publisher.Flux;
class SensorReading{
	String sensorId;
	double value;
	
	SensorReading(String sensorId, double value){
		this.sensorId=sensorId;
		this.value=value;
	}
	public String getSensorId() {
		return sensorId;
	}
	public double getvalue() {
		return value;
	}
}
public class SensorDataProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flux<SensorReading> sensorDataStream= createSensorDataStream();
		sensorDataStream.filter(a->a.getvalue()>10)
		.map(a->new SensorReading(a.getSensorId(),Math.pow(a.getvalue(), 2)))
		.subscribe(
				a->System.out.println(a.getSensorId()+" "+a.getvalue())
				);
		
		

	}
	static Flux<SensorReading> createSensorDataStream(){
		return Flux.create(emitter->{
			emitter.next(new SensorReading("Sensor 1", 1));
			emitter.next(new SensorReading("Sensor 2", 12));
			emitter.next(new SensorReading("Sensor 3", 13));
			emitter.next(new SensorReading("Sensor 4", 15));
			emitter.next(new SensorReading("Sensor 5", 17));
			emitter.next(new SensorReading("Sensor 6", 10));
		}
		
		);
	}

}
