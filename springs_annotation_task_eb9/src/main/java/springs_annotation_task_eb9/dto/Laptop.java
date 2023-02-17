package springs_annotation_task_eb9.dto;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Item {

	public void used() {
		System.out.println("To Work");
	}

}
