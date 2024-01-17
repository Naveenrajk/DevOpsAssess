package com.rts.evaluation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.pojo.Customer;

@Repository
public class CustomerDAO {
	static List<Customer> list;

	public static boolean insert(Customer bean) {
		list = new ArrayList<Customer>();

		return list.add(bean);

	}

	public static List<Customer> view() {
		return list;
	}

}


