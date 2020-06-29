package chap11_7;


import java.io.IOException;
import java.util.*;
import java.lang.*;

public class ByteToStringEx1 {

	public static void main(String[] args) throws IOException {

		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};

		System.out.println(bytes);
		String st1 = new String(bytes);
		System.out.println(st1);
		String st2 = new String(bytes, 2, 3);
		System.out.println(st2);
		
		byte[] bts1 = new byte[100];
		System.out.println("song title : ");
		int readByteNo = System.in.read(bts1);	//바이트수
		System.out.println(readByteNo);
		String st3 = new String(bts1, 0, readByteNo-2);	//2바이트 공백으로인해 글자수에서 2를빼야함
		System.out.println(st3);
	
		}
		
	}


