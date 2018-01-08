package com.enernoc.open.oadr2;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class MyNamespaceMapper extends NamespacePrefixMapper {

	private static final String OADR_PREFIX = "oadr"; // DEFAULT NAMESPACE
	private static final String OADR_URI = "http://www.example.com/FOO";

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		return OADR_PREFIX;
	}

	@Override
	public String[] getPreDeclaredNamespaceUris() {
		return new String[] { OADR_URI };
	}

}