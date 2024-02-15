package ch18.fileio.bytestream01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * binary file(기계어로 된 파일) -> 메모장에서 열면 깨져보임
 * ; 이미지, 영상, 실행파일...
 * 
 * 메모리의 변수 값을 바이너리 파일로 저장시
 * byte stream class와 함께 
 * filter class를 사용하면 편리
 */
public class DataBufferFilterStream {
	public static void main(String[] args) throws IOException {
		// 출력 스트림 생성
		OutputStream out = new FileOutputStream("data.bin");
		// 버퍼 필터 클래스
		BufferedOutputStream bOut = new BufferedOutputStream(out);
		// 필터 클래스(변수 값 저장에 편리한 기능 제공)
		DataOutputStream filterOut = new DataOutputStream(bOut);
		
		// 저장할 변수
		int num = 365;
		double pi = 3.14;
		String name = "Albert";
		byte[] nameBuf = name.getBytes();			// String -> byte
		int nameLen = nameBuf.length;				// byte[]의 길이
		// data.bin에 저장
		filterOut.write(num);
		filterOut.writeDouble(pi);
		filterOut.close();  			//출력 스트림 종료
		
		// 입력스트림을 생성해 읽어들이자.
		InputStream in = new FileInputStream("data.bin");
		BufferedInputStream bIn = new BufferedInputStream(in);
		DataInputStream filterIn = new DataInputStream(bIn);
		int inNum = filterIn.readInt();
		double inPi = filterIn.readDouble();
		byte[] inNameBuf = new byte[nameLen];	//읽어들일 길이 배열
		filterIn.read(inNameBuf, 0, nameLen);	// 배열에 읽어들임
		filterIn.close(); 				// 입력 스트림 종료
		
		
		System.out.println("inNum = " + inNum);
		System.out.println("inPi = " + inPi);
		System.out.println("inName = " + new String(inNameBuf));	// 입력해준 것을 스트링으로 전환
	}
}
