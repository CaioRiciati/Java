package entities;

import java.util.Date;

public class HourContract {
	private Date day;
	private Double valuePerHour;
	private Integer Hours;
	
	public HourContract() {
		
	}
	
	public HourContract(Date day, Double valuePerHour, Integer hours) {
		super();
		this.day = day;
		this.valuePerHour = valuePerHour;
		Hours = hours;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}
	
	
	
}
