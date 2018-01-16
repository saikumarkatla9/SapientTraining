package com.training;

import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.commons.JcrUtils;

public class WriteContent {

	public static void main(String[] args) throws RepositoryException {
		Repository repo = JcrUtils.getRepository("http://localhost:8083/server");
		Session ses = repo.login(new SimpleCredentials("admin","admin".toCharArray()));
		Node root = ses.getRootNode();
		Node film =root.addNode("film");
		Node hwood = film.addNode("hollywood");
		Node bwood = film.addNode("hollywood");
		Node jumanji = hwood.addNode("jumanji");
		jumanji.setProperty("review by kumar", "good");
		jumanji.setProperty("review by janith", "average");
		
		Node n1921 = bwood.addNode("1921"); 
		n1921.setProperty("review by harnman", "no horror");
		n1921.setProperty("review by sandeep", "not bad");
		
		ses.save();
		ses.logout();
		System.out.println("content published");
	}

}
