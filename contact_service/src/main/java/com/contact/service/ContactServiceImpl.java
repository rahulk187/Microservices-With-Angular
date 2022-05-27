package com.contact.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	ContactRepository contactRepository;

//	List<Contact> list = Arrays.asList(
//			new Contact(1l, "demo1@gmail.com", "Demo", 1311l),
//			new Contact(2l, "demo2@gmail.com", "Demo", 1312l),
//			new Contact(3l, "demo3@gmail.com", "Demo", 1313l),
//			new Contact(4l, "demo4@gmail.com", "Demo", 1314l)
//			);
	
	@Override
	public List<Contact> getContactofUser(Long userId) {
//		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
		Contact contact = null;
		Optional<Contact> optional = contactRepository.findById(userId);
		if (optional.isPresent()) {
			contact = optional.get();
		}
		List<Contact> li = new ArrayList<>();
		li.add(contact);
		return li;
	}
}
