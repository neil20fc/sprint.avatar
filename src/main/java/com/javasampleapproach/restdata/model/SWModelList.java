package com.javasampleapproach.restdata.model;

import java.util.List;

public class SWModelList<T> {

	/**
	 * Created by Oleur on 22/12/2014.
	 * Film list model
	 */

	    public int count;
	    public String next;
	    public String previous;
	    public List<T> results;

	    public boolean hasMore() {
	        return (next != null && !next.isEmpty());
	    }

}
