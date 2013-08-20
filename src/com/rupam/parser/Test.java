package com.rupam.parser;

import java.util.ArrayList;

import org.htmlcleaner.TagNode;

public class Test {

	public static void main(String args[]) {
		try {
			Parser pp = new Parser(
					"http://stats.espncricinfo.com/ci/engine/stats/index.html?class=1;spanmin1=01+Jan+2001;spanval1=span;team=2;template=results;type=aggregate");

			// the code below will fetch all "tr" elements with class name
			// "data1" from the requested url's DOM
			ArrayList<TagNode> list = pp.getElementsByClassName("tr", "data1");
			System.out.println(list.size());

			// the code below will search for all the "td" elements under the
			// first element of the previous lists DOM
			ArrayList<TagNode> subList = pp.getElementsByClassName(list.get(0),
					"td", null);
			System.out.println(subList.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
