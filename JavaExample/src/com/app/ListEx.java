package com.app;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Raj");
		names.add("Samuel");
		names.add("shultz");
		names.add("anu");
		for(String name : names) {
			System.out.println("name: "+name);
			System.out.println("dummy");

		}

}
}
