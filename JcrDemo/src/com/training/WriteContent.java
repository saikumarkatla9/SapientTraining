package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class WriteContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = new TransientRepository();
		Session ses = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		Node root = ses.getRootNode();
		Node courses = root.addNode("courses");
		Node java = courses.addNode("java");
		Node jee = courses.addNode("jee");
		java.setProperty("what is java", "java is OO programming language");
		java.setProperty("features of java", "functional programming, nashon script, lambda expression,streams");
		java.setProperty("datatypes", "int-4,float: 8 ");
		java.setProperty("life cycle of servlet", "init() and destroy() fires only once, service() multiple times");
		java.setProperty("implicit objects", "application,session,request,response");
		
		ses.save();
		System.out.println("content published");
		ses.logout();
	}

}
