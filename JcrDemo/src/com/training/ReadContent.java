package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class ReadContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = new TransientRepository();
		Session ses = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		Node node= ses.getNode("/courses/jee");
		Property prop = node.getProperty("lifecycle of servlet");
		System.out.println(prop.getString());
		
		System.out.println("getting all the prpertirs of java node---");
		Node java = ses.getNode(".corses/java");
		PropertyIterator it= java.getProperties();
		Property property=null;
		while(it.hasNext()){
			property = (Property) it.next();
			System.out.println(property  + "---" + property.getString());
		}
		ses.logout();
		
		
	}

}
