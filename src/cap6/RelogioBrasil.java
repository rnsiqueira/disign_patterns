package cap6;

import java.util.Calendar;

public class RelogioBrasil  implements Relogio{

	@Override
	public Calendar hora() {
		
		return Calendar.getInstance();
	}
	

}
