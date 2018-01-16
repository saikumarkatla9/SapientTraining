package com.training;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.commons.JcrUtils;

public class RedContent {

	public static void main(String[] args) throws RepositoryException {
		Repository repo = JcrUtils.getRepository("http://localhost:8083/server");
		Session ses = repo.login(new SimpleCredentials("admin","admin".toCharArray()));
		Node jumanji = ses.getNode("/film/hollywood/jumanji");
		PropertyIterator it = jumanji.getProperties();
		Property prop =null;
		while(it.hasNext()){
			prop = (Property) it.next();
			System.out.println(prop.getName()+"--> "+prop.getString());
		}
		ses.logout();
	}

}
