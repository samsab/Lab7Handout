package edu.miamioh.cse283.lab7;

import java.util.Arrays;

/**
 * Software network template for CSE283 Lab 7, FS2014.
 * 
 * @author dk
 */
public class LinkState {

	/** The link state matrix of distances.
	 * 
	 * M[i][j] is the cost of the link from node i to node j. 
	 */
	protected double[][] M;
	
	/** Constructor. */
	public LinkState(int n) {
		M = new double[n][];
		for(int i=0; i<n; ++i) {
			M[i] = new double[n];
			Arrays.fill(M[i], Double.POSITIVE_INFINITY);
		}
	}
	
	/**
	 * Adds a bidirectional link with the specified cost.
	 */
	public void link(int i, int j, double w) {
		M[i][j] = w;
		M[j][i] = w;
	}
	
	/**
	 * Runs Dijkstra's algorithm on the distance matrix M.
	 */
	public void calculat_shortest_paths() {
		// your code goes here.
	}

	public static void main(String[] args) {
		LinkState ls = new LinkState(2);
		ls.link(1, 2, 1.0);
		
		ls.calculat_shortest_paths();
	}	
}
