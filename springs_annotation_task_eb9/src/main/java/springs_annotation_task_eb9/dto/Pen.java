package springs_annotation_task_eb9.dto;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Item {

	double cost = 60;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void used() {
		System.out.println("To Write");
	}

}
