package com.rupam.parser;

import java.net.URL;
import java.util.ArrayList;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

public class Parser {
	HtmlCleaner cleaner;
	TagNode root;

	public Parser(String url) throws Exception {
		cleaner = new HtmlCleaner();
		root = cleaner.clean(new URL(url));
	}

	public ArrayList<TagNode> getElementsByClassName(String elementName,
			String className) {
		ArrayList<TagNode> retList = new ArrayList<>();

		TagNode[] elementList = root.getElementsByName(elementName, true);
		for (TagNode node : elementList) {
			String classType = node.getAttributeByName("class");

			if (className == null) {
				retList.add(node);
			} else if (classType != null && classType.equals(className)) {
				retList.add(node);
			}
		}

		return retList;
	}

	public ArrayList<TagNode> getElementsByClassName(TagNode tempRoot,
			String elementName, String className) {
		ArrayList<TagNode> retList = new ArrayList<>();

		TagNode[] elementList = tempRoot.getElementsByName(elementName, true);
		for (TagNode node : elementList) {
			String classType = node.getAttributeByName("class");

			if (className == null) {
				retList.add(node);
			} else if (classType != null && classType.equals(className)) {
				retList.add(node);
			}
		}

		return retList;
	}

}
