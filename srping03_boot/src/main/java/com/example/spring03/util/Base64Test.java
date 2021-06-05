package com.example.spring03.util;

import org.apache.commons.codec.binary.Base64;

public class Base64Test {
	

	private static String encodeBase64_1(String str) {
		String result_str = ""; 
		/* base64 encoding */ 
		byte[] encodedBytes = Base64.encodeBase64(str.getBytes()); 
		
		/* base64 decoding */ 
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes); 
		System.out.println("인코딩 전 : " + str); 
		System.out.println("인코딩 text : " + new String(encodedBytes)); 
		System.out.println("디코딩 text : " + new String(decodedBytes));
		
		result_str = new String(encodedBytes);
		
		return result_str;

	}
	
	private static String encodeBase64(String str) {
		String result_str = ""; 
		/* base64 encoding */ 
		byte[] encodedBytes = Base64.encodeBase64(str.getBytes()); 
		
		/* base64 decoding */ 
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes); 
		System.out.println("인코딩 전 : " + str); 
		System.out.println("인코딩 text : " + new String(encodedBytes)); 
		System.out.println("디코딩 text : " + new String(decodedBytes));
		
		result_str = new String(encodedBytes);
		
		//
		
		return result_str;

	}
	
	private static String decodeBase64(String str) {
		
		//4.10
		
		return new String(Base64.decodeBase64(str.getBytes()));
	}
	
	
	public static void main(String[] args) {
//		base64();
		String str = "ab";
		String encodeBase64_str = new String(Base64.encodeBase64(str.getBytes()));
		
		/* base64 decoding */ 
		Base64.decodeBase64(encodeBase64_str.getBytes()); 
		
//		System.out.println("encodeBase64>>>>>>>>>>>" + encodeBase64(str));
//		System.out.println("decodeBase64>>>>>>>>>>>" + decodeBase64(encodeBase64_str));
		
		
		
		System.out.println("encodeBase64>>>>>>>>>>>" + encodeBase64_str);
		System.out.println("decodeBase64>>>>>>>>>>>" + new String(Base64.decodeBase64(encodeBase64_str.getBytes())));
	}
	  
	 
}
